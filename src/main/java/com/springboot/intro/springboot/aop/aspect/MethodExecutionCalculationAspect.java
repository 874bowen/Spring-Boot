package com.springboot.intro.springboot.aop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// AOP
// Configuration
@Aspect // ASPECT -> is a combination of a POINTCUT & ADVICE
@Configuration
public class MethodExecutionCalculationAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //@Around("execution(* com.springboot.intro.springboot.aop..*.*(..))")
    // tracks all the things in the aop package
    @Around("com.springboot.intro.springboot.aop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable{
        long startTime = System.currentTimeMillis();
        joinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        // startTime = x
        // allow execution of method
        // endTime = y
        logger.info("Time Taken by {} is {} ", joinPoint, timeTaken);
    }
}
