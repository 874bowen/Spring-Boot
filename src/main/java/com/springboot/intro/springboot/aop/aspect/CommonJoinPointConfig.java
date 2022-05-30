package com.springboot.intro.springboot.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    // Business Layer PointCut
    @Pointcut("execution(* com.springboot.intro.springboot.aop.business.*.*(..))")
    public void businessLayerExecution(){}

    // Data layer PointCut
    @Pointcut("execution(* com.springboot.intro.springboot.aop.data.*.*(..))")
    public void dataLayerExecution(){}

    // combining JoinPoints && is used
    @Pointcut("com.springboot.intro.springboot.aop.aspect.CommonJoinPointConfig.businessLayerExecution() && com.springboot.intro.springboot.aop.aspect.CommonJoinPointConfig.dataLayerExecution()")
    public void allLayerExecution(){}

    // defining PointCuts using beans --> regex
    @Pointcut("bean(*dao*)") // Starts with dao -> dao*
    public void beanContainingDao(){}

    // Intercept all the calls in the data layer
//    @Pointcut("within(* com.springboot.intro.springboot.aop.data..*")
//    public void dataLayerExecutionWithWithin(){}

    // Defining PointCut using an Annotation
    @Pointcut("@annotation(com.springboot.intro.springboot.aop.aspect.TrackTime)")
    public void trackTimeAnnotation(){}
}
