package org.example.spoon;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclarePrecedence;

@Aspect
@DeclarePrecedence("LibraryAspect, LogAspect")
public class OrderOfAspects { }
