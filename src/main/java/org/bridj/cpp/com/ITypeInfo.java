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

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ValuedEnum;
import org.bridj.ann.*;
import org.bridj.cpp.com.IDispatch.DISPPARAMS;
import org.bridj.cpp.com.IDispatch.EXCEPINFO;
import org.bridj.cpp.com.OLEAutomationLibrary.ITypeLib;

import java.util.Collections;
import java.util.Iterator;

@org.bridj.cpp.com.IID("00020401-0000-0000-C000-000000000046")
@Name("ITypeInfo")
public class ITypeInfo extends org.bridj.cpp.com.IUnknown {
	static {
		BridJ.register();
	}

	public enum TYPEKIND implements ValuedEnum<TYPEKIND> {
		TKIND_ENUM(0),
		TKIND_RECORD(TKIND_ENUM.value() + 1),
		TKIND_MODULE(TKIND_RECORD.value() + 1),
		TKIND_INTERFACE(TKIND_MODULE.value() + 1),
		TKIND_DISPATCH(TKIND_INTERFACE.value() + 1),
		TKIND_COCLASS(TKIND_DISPATCH.value() + 1),
		TKIND_ALIAS(TKIND_COCLASS.value() + 1),
		TKIND_UNION(TKIND_ALIAS.value() + 1),
		TKIND_MAX(TKIND_UNION.value() + 1);
		private final long value;

		TYPEKIND(long value) {
			this.value = value;
		}

		public long value() {
			return value;
		}

		public Iterator<TYPEKIND> iterator() {
			return Collections.singleton(this).iterator();
		}
	}

	public static class TYPEATTR extends StructObject {
		@Field(0)
		public GUID guid() {
			return this.io.getNativeObjectField(this, 0);
		}

		@Field(0)
		public TYPEATTR guid(GUID guid) {
			this.io.setNativeObjectField(this, 0, guid);
			return this;
		}

		@Field(1)
		public int lcid() {
			return this.io.getIntField(this, 1);
		}

		@Field(1)
		public TYPEATTR lcid(int lcid) {
			this.io.setIntField(this, 1, lcid);
			return this;
		}

		@Field(2)
		public int dwReserved() {
			return this.io.getIntField(this, 2);
		}

		@Field(2)
		public TYPEATTR dwReserved(int dwReserved) {
			this.io.setIntField(this, 2, dwReserved);
			return this;
		}

		@Field(3)
		public int memidConstructor() {
			return this.io.getIntField(this, 3);
		}

		@Field(3)
		public TYPEATTR memidConstructor(int memid) {
			this.io.setIntField(this, 3, memid);
			return this;
		}

		@Field(4)
		public int memidDestructor() {
			return this.io.getIntField(this, 4);
		}

		@Field(4)
		public TYPEATTR memidDestructor(int memid) {
			this.io.setIntField(this, 4, memid);
			return this;
		}

		@Field(5)
		public Pointer<Character> lpstrSchema() {
			return this.io.getPointerField(this, 5);
		}

		@Field(5)
		public TYPEATTR lpstrSchema(Pointer<Character> schema) {
			this.io.setPointerField(this, 5, schema);
			return this;
		}

		@Field(6)
		public int cbSizeInstance() {
			return this.io.getIntField(this, 6);
		}

		@Field(6)
		public TYPEATTR cbSizeInstance(int cbSizeInstance) {
			this.io.setIntField(this, 6, cbSizeInstance);
			return this;
		}

		@Field(7)
		public ValuedEnum<TYPEKIND> typekind() {
			return this.io.getEnumField(this, 7);
		}

		@Field(7)
		public TYPEATTR typekind(ValuedEnum<TYPEKIND> typekind) {
			this.io.setEnumField(this, 7, typekind);
			return this;
		}

		@Field(8)
		public short cFuncs() {
			return this.io.getShortField(this, 8);
		}

		@Field(8)
		public TYPEATTR cFuncs(short cFuncs) {
			this.io.setShortField(this, 8, cFuncs);
			return this;
		}

		@Field(9)
		public short cVars() {
			return this.io.getShortField(this, 9);
		}

		@Field(9)
		public TYPEATTR cVars(short cVars) {
			this.io.setShortField(this, 9, cVars);
			return this;
		}

		@Field(10)
		public short cImplTypes() {
			return this.io.getShortField(this, 10);
		}

		@Field(10)
		public TYPEATTR cImplTypes(short cImplTypes) {
			this.io.setShortField(this, 10, cImplTypes);
			return this;
		}

		@Field(11)
		public short cbSizeVft() {
			return this.io.getShortField(this, 11);
		}

		@Field(11)
		public TYPEATTR cbSizeVft(short cbSizeVft) {
			this.io.setShortField(this, 11, cbSizeVft);
			return this;
		}

		@Field(12)
		public short cbAlignment() {
			return this.io.getShortField(this, 12);
		}

		@Field(12)
		public TYPEATTR cbAlignment(short cbAlignment) {
			this.io.setShortField(this, 12, cbAlignment);
			return this;
		}

		@Field(13)
		public short wTypeFlags() {
			return this.io.getShortField(this, 13);
		}

		@Field(13)
		public TYPEATTR wTypeFlags(short wTypeFlags) {
			this.io.setShortField(this, 13, wTypeFlags);
			return this;
		}

		@Field(14)
		public short wMajorVerNum() {
			return this.io.getShortField(this, 14);
		}

		@Field(14)
		public TYPEATTR wMajorVerNum(short wMajorVerNum) {
			this.io.setShortField(this, 14, wMajorVerNum);
			return this;
		}

		@Field(15)
		public short wMinorVerNum() {
			return this.io.getShortField(this, 15);
		}

		@Field(15)
		public TYPEATTR wMinorVerNum(short wMinorVerNum) {
			this.io.setShortField(this, 15, wMinorVerNum);
			return this;
		}

		@Field(16)
		public TYPEDESC tdescAlias() {
			return this.io.getNativeObjectField(this, 16);
		}

		@Field(16)
		public TYPEATTR tdescAlias(TYPEDESC descAlias) {
			this.io.setNativeObjectField(this, 16, descAlias);
			return this;
		}
		/** Conversion Error : TYPEDESC (failed to convert type to Java (undefined type)) */
		/** Conversion Error : IDLDESC (failed to convert type to Java (undefined type)) */
	}

	public static class TYPEDESC extends StructObject {
		@Field(0)
		public TYPEDESC_U union() {
			return this.io.getNativeObjectField(this, 0);
		}

		@Field(0)
		public TYPEDESC union(TYPEDESC_U field1) {
			this.io.setNativeObjectField(this, 0, field1);
			return this;
		}

		@Field(1)
		public ValuedEnum<VARENUM> vt() {
			return this.io.getEnumField(this, 1);
		}

		@Field(1)
		public TYPEDESC vt(ValuedEnum<VARENUM> vt) {
			this.io.setEnumField(this, 1, vt);
			return this;
		}

		@Union
		public static class TYPEDESC_U extends StructObject {
			/**
			 * C type : tagTYPEDESC*
			 */
			@Field(0)
			public Pointer<TYPEDESC> lptdesc() {
				return this.io.getPointerField(this, 0);
			}

			/**
			 * C type : tagTYPEDESC*
			 */
			@Field(0)
			public TYPEDESC_U lptdesc(Pointer<TYPEDESC> lptdesc) {
				this.io.setPointerField(this, 0, lptdesc);
				return this;
			}

			/**
			 * C type : tagARRAYDESC*
			 */
			@Field(1)
			public Pointer<ARRAYDESC> lpadesc() {
				return this.io.getPointerField(this, 1);
			}

			/**
			 * C type : tagARRAYDESC*
			 */
			@Field(1)
			public TYPEDESC_U lpadesc(Pointer<ARRAYDESC> lpadesc) {
				this.io.setPointerField(this, 1, lpadesc);
				return this;
			}

			@Field(2)
			public int hreftype() {
				return this.io.getIntField(this, 2);
			}

			@Field(2)
			public TYPEDESC_U hreftype(int reftype) {
				this.io.setIntField(this, 2, reftype);
				return this;
			}
		}
	}

	public static class ARRAYDESC extends StructObject {
		@Field(0)
		public TYPEDESC tdescElem() {
			return this.io.getNativeObjectField(this, 0);
		}

		@Field(0)
		public ARRAYDESC tdescElem(TYPEDESC descElem) {
			this.io.setNativeObjectField(this, 0, descElem);
			return this;
		}

		@Field(1)
		public short cDims() {
			return this.io.getShortField(this, 1);
		}

		@Field(1)
		public ARRAYDESC cDims(short dims) {
			this.io.setShortField(this, 1, dims);
			return this;
		}

		@Array({1})
		@Field(2)
		public Pointer<SAFEARRAYBOUND> rgbounds() {
			return this.io.getPointerField(this, 2);
		}
	}

	public static class IDLDESC extends StructObject {
		@Field(0)
		@Ptr
		public long dwReserved() {
			return this.io.getSizeTField(this, 0);
		}

		@Field(0)
		public IDLDESC dwReserved(@Ptr long dwReserved) {
			this.io.setSizeTField(this, 0, dwReserved);
			return this;
		}

		@Field(1)
		public short wIDLFlags() {
			return this.io.getShortField(this, 1);
		}

		@Field(1)
		public IDLDESC wIDLFlags(short idlFlags) {
			this.io.setShortField(this, 1, idlFlags);
			return this;
		}
	}

	public static class PARAMDESC extends StructObject {
		@Field(0)
		public Pointer<?> pparamdescex() {
			return this.io.getPointerField(this, 0);
		}

		@Field(0)
		public PARAMDESC pparamdescex(Pointer<?> paramDescEx) {
			this.io.setPointerField(this, 0, paramDescEx);
			return this;
		}

		@Field(1)
		public short wParamFlags() {
			return this.io.getShortField(this, 1);
		}

		@Field(1)
		public PARAMDESC wParamFlags(short wParamFlags) {
			this.io.setShortField(this, 1, wParamFlags);
			return this;
		}
	}

	public static class ELEMDESC extends StructObject {
		@Field(0)
		public TYPEDESC tdesc() {
			return this.io.getNativeObjectField(this, 0);
		}

		@Field(0)
		public ELEMDESC tdesc(TYPEDESC tdesc) {
			this.io.setNativeObjectField(this, 0, tdesc);
			return this;
		}

		@Field(1)
		public ELEMDESC_U union() {
			return this.io.getNativeObjectField(this, 1);
		}

		@Field(1)
		public ELEMDESC union(ELEMDESC_U u) {
			this.io.setNativeObjectField(this, 1, u);
			return this;
		}

		@Union
		public static class ELEMDESC_U extends StructObject {
			@Field(0)
			public IDLDESC idldesc() {
				return this.io.getNativeObjectField(this, 0);
			}

			@Field(0)
			public ELEMDESC_U idldesc(IDLDESC idldesc) {
				this.io.setNativeObjectField(this, 0, idldesc);
				return this;
			}

			@Field(1)
			public PARAMDESC paramdesc() {
				return this.io.getNativeObjectField(this, 1);
			}

			@Field(1)
			public ELEMDESC_U idldesc(PARAMDESC paramdesc) {
				this.io.setNativeObjectField(this, 1, paramdesc);
				return this;
			}
		}
	}

	public static class FUNCDESC extends StructObject {
		@Field(0)
		public int memid() {
			return this.io.getIntField(this, 0);
		}

		@Field(0)
		public FUNCDESC memid(int memid) {
			this.io.setIntField(this, 0, memid);
			return this;
		}

		/**
		 * C type : SCODE*
		 */
		@Field(1)
		public Pointer<Integer> lprgscode() {
			return this.io.getPointerField(this, 1);
		}

		/**
		 * C type : SCODE*
		 */
		@Field(1)
		public FUNCDESC lprgscode(Pointer<Integer> lprgscode) {
			this.io.setPointerField(this, 1, lprgscode);
			return this;
		}

		/**
		 * C type : ELEMDESC*
		 */
		@Field(2)
		public Pointer<ELEMDESC> lprgelemdescParam() {
			return this.io.getPointerField(this, 2);
		}

		/**
		 * C type : ELEMDESC*
		 */
		@Field(2)
		public FUNCDESC lprgelemdescParam(Pointer<ELEMDESC> lprgelemdescParam) {
			this.io.setPointerField(this, 2, lprgelemdescParam);
			return this;
		}

		@Field(3)
		public int funckind() {
			return this.io.getIntField(this, 3);
		}

		@Field(3)
		public FUNCDESC funckind(int funckind) {
			this.io.setIntField(this, 3, funckind);
			return this;
		}

		@Field(4)
		public int invkind() {
			return this.io.getIntField(this, 4);
		}

		@Field(4)
		public FUNCDESC invkind(int invkind) {
			this.io.setIntField(this, 4, invkind);
			return this;
		}

		@Field(5)
		public int callconv() {
			return this.io.getIntField(this, 5);
		}

		@Field(5)
		public FUNCDESC callconv(int callconv) {
			this.io.setIntField(this, 5, callconv);
			return this;
		}

		@Field(6)
		public short cParams() {
			return this.io.getShortField(this, 6);
		}

		@Field(6)
		public FUNCDESC cParams(short cParams) {
			this.io.setShortField(this, 6, cParams);
			return this;
		}

		@Field(7)
		public short cParamsOpt() {
			return this.io.getShortField(this, 7);
		}

		@Field(7)
		public FUNCDESC cParamsOpt(short cParamsOpt) {
			this.io.setShortField(this, 7, cParamsOpt);
			return this;
		}

		@Field(8)
		public short oVft() {
			return this.io.getShortField(this, 8);
		}

		@Field(8)
		public FUNCDESC oVft(short oVft) {
			this.io.setShortField(this, 8, oVft);
			return this;
		}

		@Field(9)
		public short cScodes() {
			return this.io.getShortField(this, 9);
		}

		@Field(9)
		public FUNCDESC cScodes(short cScodes) {
			this.io.setShortField(this, 9, cScodes);
			return this;
		}

		@Field(10)
		public ELEMDESC elemdescFunc() {
			return this.io.getNativeObjectField(this, 10);
		}

		@Field(10)
		public FUNCDESC elemdescFunc(ELEMDESC elemdesc) {
			this.io.setNativeObjectField(this, 10, elemdesc);
			return this;
		}

		@Field(11)
		public short wFuncFlags() {
			return this.io.getShortField(this, 11);
		}

		@Field(11)
		public FUNCDESC wFuncFlags(short wFuncFlags) {
			this.io.setShortField(this, 11, wFuncFlags);
			return this;
		}
	}

	public static class VARDESC extends StructObject {
		@Field(0)
		public int memid() {
			return this.io.getIntField(this, 0);
		}

		@Field(0)
		public VARDESC memid(int memid) {
			this.io.setIntField(this, 0, memid);
			return this;
		}

		@Field(1)
		public Pointer<Character> lpstrSchema() {
			return this.io.getPointerField(this, 1);
		}

		@Field(1)
		public VARDESC lpstrSchema(Pointer<Character> schema) {
			this.io.setPointerField(this, 1, schema);
			return this;
		}

		@Union
		public static class VARDESC_U extends StructObject {
			@Field(0)
			public long oInst() {
				return this.io.getLongField(this, 0);
			}

			@Field(0)
			public VARDESC_U oInst(long inst) {
				this.io.setLongField(this, 0, inst);
				return this;
			}

			@Field(1)
			public Pointer<VARIANT> lpvarValue() {
				return this.io.getPointerField(this, 1);
			}

			@Field(1)
			public VARDESC_U lpvarValue(Pointer<VARIANT> value) {
				this.io.setPointerField(this, 1, value);
				return this;
			}
		}

		@Field(2)
		public VARDESC_U instValueUnion() {
			return this.io.getNativeObjectField(this, 2);
		}

		@Field(3)
		public ELEMDESC elemdescVar() {
			return this.io.getNativeObjectField(this, 3);
		}

		@Field(3)
		public VARDESC elemdescVar(ELEMDESC desc) {
			this.io.setNativeObjectField(this, 3, desc);
			return this;
		}

		@Field(4)
		public short wVarFlags() {
			return this.io.getShortField(this, 4);
		}

		@Field(4)
		public VARDESC wVarFlags(short flags) {
			this.io.setShortField(this, 4, flags);
			return this;
		}

		@Field(5)
		public ValuedEnum<VARKIND> varkind() {
			return this.io.getEnumField(this, 5);
		}

		@Field(5)
		public VARDESC varkind(ValuedEnum<VARKIND> varkind) {
			this.io.setEnumField(this, 5, varkind);
			return this;
		}
	}

	public enum VARKIND implements ValuedEnum {
		VAR_PERSISTANCE(0),
		VAR_STATIC(VAR_PERSISTANCE.value() + 1),
		VAR_CONST(VAR_STATIC.value() + 1),
		VAR_DISPATCH(VAR_CONST.value() + 1);
		private final long value;

		VARKIND(long value) {
			this.value = value;
		}

		public long value() {
			return value;
		}

		public Iterator iterator() {
			return Collections.singleton(this).iterator();
		}
	}

	/**
	 * [local]<br>
	 * Original signature : <code>HRESULT GetTypeAttr(TYPEATTR**)</code><br>
	 * <i>native declaration : line 7</i>
	 */
	@Name("GetTypeAttr")
	@Virtual(0)
	public native int getTypeAttr(Pointer<Pointer<TYPEATTR>> ppTypeAttr);

	/**
	 * Original signature : <code>HRESULT GetTypeComp(ITypeComp**)</code><br>
	 * <i>native declaration : line 10</i>
	 */
	@Name("GetTypeComp")
	@Virtual(1)
	public native int getTypeComp(Pointer<Pointer<IUnknown>> ppTComp);

	/**
	 * [local]<br>
	 * Original signature : <code>HRESULT GetFuncDesc(UINT, FUNCDESC**)</code><br>
	 * <i>native declaration : line 13</i>
	 */
	@Name("GetFuncDesc")
	@Virtual(2)
	public native int getFuncDesc(int index, Pointer<Pointer<FUNCDESC>> ppFuncDesc);

	/**
	 * [local]<br>
	 * Original signature : <code>HRESULT GetVarDesc(UINT, VARDESC**)</code><br>
	 * <i>native declaration : line 17</i>
	 */
	@Name("GetVarDesc")
	@Virtual(3)
	public native int getVarDesc(int index, Pointer<Pointer<VARDESC>> ppVarDesc);

	/**
	 * [local]<br>
	 * Original signature : <code>HRESULT GetNames(MEMBERID, BSTR*, UINT, UINT*)</code><br>
	 * <i>native declaration : line 21</i>
	 */
	@Name("GetNames")
	@Virtual(4)
	public native int getNames(int memid, Pointer<Pointer<Character>> rgBstrNames, int cMaxNames, Pointer<Integer> pcNames);

	/**
	 * Original signature : <code>HRESULT GetRefTypeOfImplType(UINT, HREFTYPE*)</code><br>
	 * <i>native declaration : line 27</i>
	 */
	@Name("GetRefTypeOfImplType")
	@Virtual(5)
	public native int getRefTypeOfImplType(int index, Pointer<Integer> pRefType);

	/**
	 * Original signature : <code>HRESULT GetImplTypeFlags(UINT, INT*)</code><br>
	 * <i>native declaration : line 31</i>
	 */
	@Name("GetImplTypeFlags")
	@Virtual(6)
	public native int getImplTypeFlags(int index, Pointer<Integer> pImplTypeFlags);

	/**
	 * [local]<br>
	 * Original signature : <code>HRESULT GetIDsOfNames(LPOLESTR*, UINT, MEMBERID*)</code><br>
	 * <i>native declaration : line 35</i>
	 */
	@Name("GetIDsOfNames")
	@Virtual(7)
	public native int getIDsOfNames(Pointer<Pointer<Character>> rgszNames, int cNames, Pointer<Integer> pMemId);

	/**
	 * [local]<br>
	 * Original signature : <code>HRESULT Invoke(PVOID, MEMBERID, WORD, DISPPARAMS*, VARIANT*, EXCEPINFO*, UINT*)</code><br>
	 * <i>native declaration : line 41</i>
	 */
	@Name("Invoke")
	@Virtual(8)
	public native int invoke(Pointer<?> pvInstance, int memid, short wFlags, Pointer<DISPPARAMS> pDispParams, Pointer<VARIANT> pVarResult, Pointer<EXCEPINFO> pExcepInfo, Pointer<Integer> puArgErr);

	/**
	 * [local]<br>
	 * Original signature : <code>HRESULT GetDocumentation(MEMBERID, BSTR*, BSTR*, DWORD*, BSTR*)</code><br>
	 * <i>native declaration : line 50</i>
	 */
	@Name("GetDocumentation")
	@Virtual(9)
	public native int getDocumentation(int memid, Pointer<Pointer<Character>> pBstrName, Pointer<Pointer<Character>> pBstrDocString, Pointer<Integer> pdwHelpContext, Pointer<Pointer<Character>> pBstrHelpFile);

	/**
	 * [local]<br>
	 * Original signature : <code>HRESULT GetDllEntry(MEMBERID, INVOKEKIND, BSTR*, BSTR*, WORD*)</code><br>
	 * <i>native declaration : line 57</i>
	 */
	@Name("GetDllEntry")
	@Virtual(10)
	public native int getDllEntry(int memid, short invKind, Pointer<Pointer<Character>> pBstrDllName, Pointer<Pointer<Character>> pBstrName, Pointer<Short> pwOrdinal);

	/**
	 * Original signature : <code>HRESULT GetRefTypeInfo(HREFTYPE, ITypeInfo**)</code><br>
	 * <i>native declaration : line 64</i>
	 */
	@Name("GetRefTypeInfo")
	@Virtual(11)
	public native int getRefTypeInfo(int hRefType, Pointer<Pointer<ITypeInfo>> ppTInfo);

	/**
	 * [local]<br>
	 * Original signature : <code>HRESULT AddressOfMember(MEMBERID, INVOKEKIND, PVOID*)</code><br>
	 * <i>native declaration : line 68</i>
	 */
	@Name("AddressOfMember")
	@Virtual(12)
	public native int addressOfMember(int memid, short invKind, Pointer<Pointer<?>> ppv);

	/**
	 * [local]<br>
	 * Original signature : <code>HRESULT CreateInstance(IUnknown*, const IID&amp; PVOID*)</code><br>
	 * <i>native declaration : line 73</i>
	 */
	@Name("CreateInstance")
	@Virtual(13)
	public native int createInstance(Pointer<IUnknown> pUnkOuter, Pointer<GUID> riid, Pointer<Pointer<?>> ppvObj);

	/**
	 * Original signature : <code>HRESULT GetMops(MEMBERID, BSTR*)</code><br>
	 * <i>native declaration : line 78</i>
	 */
	@Name("GetMops")
	@Virtual(14)
	public native int getMops(int memid, Pointer<Pointer<Character>> pBstrMops);

	/**
	 * [local]<br>
	 * Original signature : <code>HRESULT GetContainingTypeLib(ITypeLib**, UINT*)</code><br>
	 * <i>native declaration : line 82</i>
	 */
	@Name("GetContainingTypeLib")
	@Virtual(15)
	public native int getContainingTypeLib(Pointer<Pointer<ITypeLib>> ppTLib, Pointer<Integer> pIndex);

	/**
	 * [local]<br>
	 * Original signature : <code>void ReleaseTypeAttr(TYPEATTR*)</code><br>
	 * <i>native declaration : line 86</i>
	 */
	@Name("ReleaseTypeAttr")
	@Virtual(16)
	public native void releaseTypeAttr(Pointer<TYPEATTR> pTypeAttr);

	/**
	 * [local]<br>
	 * Original signature : <code>void ReleaseFuncDesc(FUNCDESC*)</code><br>
	 * <i>native declaration : line 89</i>
	 */
	@Name("ReleaseFuncDesc")
	@Virtual(17)
	public native void releaseFuncDesc(Pointer<FUNCDESC> pFuncDesc);

	/**
	 * [local]<br>
	 * Original signature : <code>void ReleaseVarDesc(VARDESC*)</code><br>
	 * <i>native declaration : line 92</i>
	 */
	@Name("ReleaseVarDesc")
	@Virtual(18)
	public native void releaseVarDesc(Pointer<VARDESC> pVarDesc);

	public ITypeInfo() {
		super();
	}
}
