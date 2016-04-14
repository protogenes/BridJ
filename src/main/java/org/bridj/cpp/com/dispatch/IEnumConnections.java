package org.bridj.cpp.com.dispatch;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Name;
import org.bridj.ann.Virtual;
import org.bridj.cpp.com.IID;
import org.bridj.cpp.com.IUnknown;
import org.bridj.cpp.com.idl.In;
import org.bridj.cpp.com.idl.Out;

/*
 * <i>native declaration : line 2</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@IID("B196B287-BAB4-101A-B69C-00AA00341D07")
@Name("IEnumConnections")
public class IEnumConnections extends IUnknown {
	static {
		BridJ.register();
	}

	/*
	 * [local]<br>
	 * Original signature : <code>HRESULT Next(ULONG, LPCONNECTDATA, ULONG*)</code><br>
	 * <i>native declaration : line 6</i>
	 */
	@Name("Next")
	@Virtual(0)
	public native int Next(@In int cConnections, @Out Pointer<CONNECTDATA> rgcd, @Out Pointer<Integer> pcFetched);

	/*
	 * Original signature : <code>HRESULT Skip(ULONG)</code><br>
	 * <i>native declaration : line 11</i>
	 */
	@Name("Skip")
	@Virtual(1)
	public native int Skip(@In int cConnections);

	/*
	 * Original signature : <code>HRESULT Reset()</code><br>
	 * <i>native declaration : line 14</i>
	 */
	@Name("Reset")
	@Virtual(2)
	public native int Reset();

	/*
	 * Original signature : <code>HRESULT Clone(IEnumConnections**)</code><br>
	 * <i>native declaration : line 16</i>
	 */
	@Name("Clone")
	@Virtual(3)
	public native int Clone(@Out Pointer<Pointer<IEnumConnections>> ppEnum);
}
