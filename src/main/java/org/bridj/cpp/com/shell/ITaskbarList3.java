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
package org.bridj.cpp.com.shell;

import org.bridj.*;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Virtual;
import org.bridj.cpp.com.CLSID;
import org.bridj.cpp.com.IID;

import java.util.Collections;
import java.util.Iterator;

@IID("EA1AFB91-9E28-4B86-90E9-9E9F8A5EEFAF")
@CLSID("56FDF344-FD6D-11d0-958A-006097C9A090")
public class ITaskbarList3 extends ITaskbarList2 {

    public enum THUMBBUTTONMASK implements ValuedEnum<THUMBBUTTONMASK> {

        THB_BITMAP(0x00000001),
        THB_ICON(0x00000002),
        THB_TOOLTIP(0x00000004),
        THB_FLAGS(0x00000008);

        THUMBBUTTONMASK(int value) {
            this.value = value;
        }
        public final int value;
        //@Override

        public long value() {
            return value;
        }

        public Iterator<THUMBBUTTONMASK> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static ValuedEnum<THUMBBUTTONMASK> fromValue(long value) {
            return FlagSet.fromValue(value, values());
        }
    }
    /// http://msdn.microsoft.com/en-us/library/dd562321(VS.85).aspx

    public enum THUMBBUTTONFLAGS implements ValuedEnum<THUMBBUTTONFLAGS> {

        THBF_ENABLED(0x00000000),
        THBF_DISABLED(0x00000001),
        THBF_DISMISSONCLICK(0x00000002),
        THBF_NOBACKGROUND(0x00000004),
        THBF_HIDDEN(0x00000008),
        THBF_NONINTERACTIVE(0x00000010);

        THUMBBUTTONFLAGS(int value) {
            this.value = value;
        }
        final int value;
        //@Override

        public long value() {
            return value;
        }

        public Iterator<THUMBBUTTONFLAGS> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static ValuedEnum<THUMBBUTTONFLAGS> fromValue(long value) {
            return FlagSet.fromValue(value, values());
        }
    }

    public static class THUMBBUTTON extends StructObject {

        @Field(0)
        public native ValuedEnum<THUMBBUTTONMASK> dwMask();

        public native void dwMask(ValuedEnum<THUMBBUTTONMASK> dwMask);

        @Field(1)
        public native int iId();

        public native void iId(int iId);

        @Field(2)
        public native int iBitmap();

        public native void iBitmap(int iBitmap);

        @Field(3)
        public native Pointer<?> hIcon();

        public native void hIcon(Pointer<?> hIcon);

        @Field(4)
        @Array(260)
        public native Pointer<Character> szTip();

        public native void szTip(Pointer<Character> szTip);

        @Field(5)
        public native ValuedEnum<THUMBBUTTONFLAGS> dwFlags();

        public native void dwFlags(ValuedEnum<THUMBBUTTONFLAGS> dwFlags);
    }

    @Virtual(0)
    public native int SetProgressValue(Pointer<Integer> hWnd, long Completed, long Total);

    public enum TbpFlag implements ValuedEnum<TbpFlag> {

        TBPF_NOPROGRESS(0),
        TBPF_INDETERMINATE(1),
        TBPF_NORMAL(2),
        TBPF_ERROR(4),
        TBPF_PAUSED(8);

        TbpFlag(int value) {
            this.value = value;
        }
        public final int value;
        //@Override/

        public long value() {
            return value;
        }

        public Iterator<TbpFlag> iterator() {
            return Collections.singleton(this).iterator();
        }

        public static ValuedEnum<TbpFlag> fromValue(long value) {
            return FlagSet.fromValue(value, values());
        }
    }

    //@Virtual(1) public native int SetProgressState(Pointer<Integer> hWnd, ValuedEnum<TbpFlag> Flags);
    @Virtual(1)
    public native int SetProgressState(Pointer<Integer> hWnd, ValuedEnum<TbpFlag> Flags);

    @Virtual(2)
    public native void RegisterTab(Pointer<Integer> hWndTab, Pointer<Integer> hWndMDI);

    @Virtual(3)
    public native void UnregisterTab(Pointer<Integer> hWndTab);

    @Virtual(4)
    public native void SetTabOrder(Pointer<Integer> hWndTab, Pointer<Integer> hwndInsertBefore);

    @Virtual(5)
    public native void SetTabActive(Pointer<Integer> hWndTab, Pointer<Integer> hWndMDI, int dwReserved);

    @Virtual(6)
    public native void ThumbBarAddButtons(Pointer<Integer> hWnd, int cButtons, Pointer<THUMBBUTTON> pButtons);

    @Virtual(7)
    public native void ThumbBarUpdateButtons(Pointer<Integer> hWnd, int cButtons, Pointer<THUMBBUTTON> pButtons);

    @Virtual(8)
    public native void ThumbBarSetImageList(Pointer<Integer> hWnd, Pointer<Integer> himl);

    @Virtual(9)
    public native void SetOverlayIcon(Pointer<Integer> hWnd, Pointer<?> hIcon, Pointer<Character> pszDescription);

    @Virtual(10)
    public native void SetThumbnailTooltip(Pointer<Integer> hWnd, Pointer<Character> pszTip);

    public class RECT {
    }

    @Virtual(11)
    public native void SetThumbnailClip(Pointer<Integer> hWnd, Pointer<RECT> prcClip);
}
