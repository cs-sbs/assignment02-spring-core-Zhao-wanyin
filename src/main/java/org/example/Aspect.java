package org.example;

import Repository.Component;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

// 1. @Aspect 标记为切面，@Component 让 Spring 扫描到
@Aspect
@Component
public class LogAspect {

    // 2. 切点表达式：匹配 org.example 包下所有类的所有方法
    @Around("execution(* org.example.*.*(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("[AOP 前置] 方法 " + joinPoint.getSignature().getName() + " 开始执行");

        Object result = joinPoint.proceed(); // 执行目标方法

        long end = System.currentTimeMillis();
        System.out.println("[AOP 后置] 方法 " + joinPoint.getSignature().getName() + " 执行结束，耗时 " + (end - start) + "ms");
        return result;
    }
}
 }
