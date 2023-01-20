package org.example.spoon.base;

import org.aspectj.lang.JoinPoint;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LibraryAspect {

    @Pointcut("execution(@LAspect * *(..))")
    private void pointCut() {}

    @Before("pointCut()")
    public void around(JoinPoint joinPoint) throws Throwable {
        System.out.println("before");
    }

}