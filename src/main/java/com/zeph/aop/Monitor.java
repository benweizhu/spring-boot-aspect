package com.zeph.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Monitor {

    @AfterReturning("execution(* com.zeph.aop.ScheduledTasks.reportCurrentTime())")
    public void logServiceAccess(JoinPoint joinPoint) {
        System.out.println("Completed: " + joinPoint);
    }

    @AfterReturning("execution(* com.zeph.aop.ScheduledTasks.reportInPrivateMethod())")
    public void logServiceAccessPrivateMethod(JoinPoint joinPoint) {
        System.out.println("Completed: " + joinPoint);
    }

    @AfterReturning("execution(* com.zeph.aop.ScheduledTasks.reportInPublicMethod())")
    public void logServiceAccessPublicMethod(JoinPoint joinPoint) {
        System.out.println("Completed: " + joinPoint);
    }
}
