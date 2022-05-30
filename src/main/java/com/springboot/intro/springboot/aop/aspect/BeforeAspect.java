package com.springboot.intro.springboot.aop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// AOP
// Configuration
@Aspect // ASPECT -> is a combination of a POINTCUT & ADVICE
@Configuration
public class BeforeAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    // What kind of method calls I would like to intercept
    // execution(* PACKAGE.*.*(...)) <- POINTCUT -> expression which defines what kind of methods
    // you would want to intercept
    // @Before annotation intercepts before the call has happened
    @Before("com.springboot.intro.springboot.aop.aspect.CommonJoinPointConfig.dataLayerExecution()")
    // to get the details add JoinPoint
    public void before(JoinPoint joinPoint){ // JOINPOINT --> specific interception of the method call
        // What to do?
        // ADVICE -> what to do when you intercept a method call do this!
        logger.info("Checking user access");
        logger.info("Intercepted Method Call!! -- {}", joinPoint); // specific execution instance
        // WEAVING - process where this whole aop gets weaved in around your code
        // ensures that this is called at the right moment
        // WEAVER - framework which implements weaving
    }
}
