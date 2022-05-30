package com.springboot.intro.springboot.aop.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// want to use TrackTime only on methods not classes
@Target(ElementType.METHOD)
// want annotation to be available only at runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface TrackTime {

}
