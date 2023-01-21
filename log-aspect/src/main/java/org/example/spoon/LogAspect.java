package org.example.spoon;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAspect {
  @Pointcut("execution(@Log * *(..))")
  private void pointCut() { }

  @Around("pointCut()")
  public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
    System.out.println("Log: " + joinPoint);
    return joinPoint.proceed();
  }
}
