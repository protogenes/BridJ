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
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bridj.cpp.com;

import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Convention;
import org.bridj.ann.Convention.Style;
import org.bridj.ann.Field;
import org.bridj.ann.Virtual;

/**
 * @author Olivier
 */
@IID("00020400-0000-0000-C000-000000000046")
public class IDispatch extends IUnknown {
	public static final int MEMBERID_NIL = -1;

	public static class DISPPARAMS extends StructObject {
		@Field(0)
		public Pointer<VARIANT> rgvarg() {
			return this.io.getPointerField(this, 0);
		}

		@Field(0)
		public DISPPARAMS rgvarg(Pointer<VARIANT> varg) {
			this.io.setPointerField(this, 0, varg);
			return this;
		}

		@Field(1)
		public Pointer<Integer> rgdispidNamedArgs() {
			return this.io.getPointerField(this, 1);
		}

		@Field(1)
		public DISPPARAMS rgdispidNamedArgs(Pointer<Integer> namedArgs) {
			this.io.setPointerField(this, 1, namedArgs);
			return this;
		}

		@Field(2)
		public int cArgs() {
			return this.io.getIntField(this, 2);
		}

		@Field(2)
		public DISPPARAMS cArgs(int args) {
			this.io.setIntField(this, 2, args);
			return this;
		}

		@Field(3)
		public int cNamedArgs() {
			return this.io.getIntField(this, 3);
		}

		@Field(3)
		public DISPPARAMS cNamedArgs(int cNamedArgs) {
			this.io.setIntField(this, 3, cNamedArgs);
			return this;
		}
	}

	public static class EXCEPINFO extends StructObject {
		@Field(0)
		public short wCode() {
			return this.io.getShortField(this, 0);
		}

		@Field(1)
		public short wReserved() {
			return this.io.getShortField(this, 1);
		}

		@Field(2)
		public Pointer<Character> bstrSource() {
			return this.io.getPointerField(this, 2);
		}

		@Field(3)
		public Pointer<Character> bstrDescription() {
			return this.io.getPointerField(this, 3);
		}

		@Field(4)
		public Pointer<Character> bstrHelpFile() {
			return this.io.getPointerField(this, 4);
		}

		@Field(5)
		public int dwHelpContext() {
			return this.io.getIntField(this, 5);
		}

		@Field(6)
		public Pointer<Void> pvReserved() {
			return this.io.getPointerField(this, 6);
		}

		@Field(7)
		public Pointer<FillInCallback> pfnDeferredFillIn() { //HRESULT (__stdcall *pfnDeferredFillIn)(struct tagEXCEPINFO *);
			return this.io.getPointerField(this, 7);
		}

		@Field(8)
		public int scode() {
			return this.io.getIntField(this, 8);
		}

		@Convention(Style.StdCall)
		public static abstract class FillInCallback extends Callback<FillInCallback> {
			public abstract int invoke(Pointer<EXCEPINFO> ex);
		}
	}

//	@DispId(0x60010000)
	@Virtual(0)
	public native int GetTypeInfoCount(Pointer<Integer> pctinfo);

//	@DispId(0x60010001)
	@Virtual(1)
	public native int GetTypeInfo(int iTInfo, int lcid, Pointer<Pointer<Void>> ppTInfo);

//	@DispId(0x60010002)
	@Virtual(2)
	public native int GetIDsOfNames(
			Pointer<GUID> riid,//REFIID riid,
			Pointer<Pointer<Byte>> rgszNames,
			int cNames,
			int lcid, //LCID lcid,
			Pointer<Integer> rgDispId); //DISPID *rgDispId);

//	@DispId(0x60010003)
	@Virtual(3)
	public native int Invoke(
			int dispIdMember,
			Pointer<GUID> riid,
			int lcid,
			short wFlags,
			Pointer<DISPPARAMS> pDispParams,
			Pointer<VARIANT> pVarResult,
			Pointer<EXCEPINFO> pExcepInfo,
			Pointer<Integer> puArgErr);
}
