package org.bridj.cpp.com.idl;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Target({ElementType.METHOD, ElementType.PARAMETER})
@Documented
public @interface DispId {
	int value();
}
