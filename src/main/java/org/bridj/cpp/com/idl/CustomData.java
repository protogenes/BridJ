package org.bridj.cpp.com.idl;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Target({ElementType.PACKAGE})
@Documented
public @interface CustomData {
	String[] value();
}
