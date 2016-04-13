/*
 * BridJ - Dynamic and blazing-fast native interop for Java.
 * http://bridj.googlecode.com/
 *
 * Copyright (c) 2010-2015, Olivier Chafik (http://ochafik.com/)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of Olivier Chafik nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY OLIVIER CHAFIK AND CONTRIBUTORS ``AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE REGENTS AND CONTRIBUTORS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.bridj.cpp.com;

import org.bridj.Pointer;
import org.bridj.ann.Convention;
import org.bridj.ann.Runtime;
import org.bridj.ann.Virtual;
import org.bridj.cpp.CPPObject;

import static org.bridj.cpp.com.COMRuntime.*;
import static org.bridj.cpp.com.COMStatus.*;

@Convention(Convention.Style.StdCall)
@IID("00000000-0000-0000-C000-000000000046")
@Runtime(COMRuntime.class)
public class IUnknown extends CPPObject {

    protected boolean autoRelease;

    @Override
    protected void finalize() throws Throwable {
        if (autoRelease) {
            Release();
        }
        super.finalize();
    }

//    @DispId(0x60000000)
    @Virtual(0)
    @Deprecated
    public native int QueryInterface(
            Pointer<GUID> riid,
            Pointer<Pointer<Void>> ppvObject);

    public <I extends IUnknown> I QueryInterface(Class<I> type) {
        Pointer<Pointer<Void>> p = Pointer.allocatePointer(Void.class);
        int ret = QueryInterface(getIID(type), p);
        if (ret != S_OK) {
            return null;
        }

        return p.get().getNativeObject(type);
    }

//    @DispId(0x60000001)
    @Virtual(1)
    public native int AddRef();

//    @DispId(0x60000002)
    @Virtual(2)
    public native int Release();
}
