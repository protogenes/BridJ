package org.bridj.cpp.com.idl;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Target({ElementType.PARAMETER})
@Documented
public @interface In {
}
