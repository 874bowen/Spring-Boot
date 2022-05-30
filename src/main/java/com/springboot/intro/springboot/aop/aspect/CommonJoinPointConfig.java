package com.springboot.intro.springboot.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    // Business Layer PointCut
    @Pointcut("execution(* com.springboot.intro.springboot.aop.business.*.*(..))")
    public void businessLayerExecution(){}

    // Data layer PointCut
    @Pointcut("execution(* com.springboot.intro.springboot.aop.data.*.*(..))")
    public void dataLayerExecution(){}
}
