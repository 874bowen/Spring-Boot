package com.springboot.intro.springboot.aop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// AOP
// Configuration
@Aspect // ASPECT -> is a combination of a POINTCUT & ADVICE
@Configuration
public class AfterAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    // What kind of method calls I would like to intercept
    // execution(* PACKAGE.*.*(...)) <- POINTCUT -> expression which defines what kind of methods
    // you would want to intercept
    // @AfterReturning called after a method has executed successfully
    @AfterReturning(
            value = "execution(* com.springboot.intro.springboot.aop.business.*.*(..))",
            returning = "result")
    // to get the details add JoinPoint
    public void afterReturning(JoinPoint joinPoint, Object result){ // JOINPOINT --> specific interception of the method call
        // What to do?
        logger.info("{} returned with the value {}", joinPoint, result); // specific execution instance
        // WEAVING - process where this whole aop gets weaved in around your code
        // ensures that this is called at the right moment
        // WEAVER - framework which implements weaving
    }
    // @AfterThrowing called when a method throws an exception
    @AfterThrowing(
            value = "execution(* com.springboot.intro.springboot.aop.business.*.*(..))",
            throwing = "exception"
    )
    public void afterThrowing(JoinPoint joinPoint, Exception exception){
        logger.info("{} throw exception {}", joinPoint, exception);
    }
    // whether throwing an exception or returning you can use @After -> normal one =?> in both situations
    @After(
            value = "execution(* com.springboot.intro.springboot.aop.business.*.*(..))"
    )
    public void after(JoinPoint joinPoint){
        logger.info("after execution of  {} ", joinPoint);
    }
}
