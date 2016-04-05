package org.bridj.cpp.com.idl;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PACKAGE})
@Documented
public @interface HelpString {
	String value();
}
