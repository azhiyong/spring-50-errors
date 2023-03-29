package org.learning.spring50errors.lesson5.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

/**
 * @author lizhiyong <lizhiyong@kuaishou.com>
 * Created on 2023-03-20
 */
@Slf4j
@Aspect
@Configuration
public class AopConfig {

    @Around("execution(* org.learning.spring50errors.lesson5.service.*.*(..))")
    public Object performance(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = joinPoint.proceed();
        long end = System.currentTimeMillis();
        log.info("{} method cost {}ms", joinPoint.toShortString(), end - start);
        return obj;
    }

    @Around("execution(* org.learning.spring50errors.lesson5.service.ElectricService.charge(..))")
    public Object chargePerformance(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = joinPoint.proceed();
        long end = System.currentTimeMillis();
        log.info("around charge {} method cost {}ms", joinPoint.toShortString(), end - start);
        return obj;
    }

    @Around("execution(* org.learning.spring50errors.lesson5.service.ElectricService.pay(..))")
    public Object payPerformance(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = joinPoint.proceed();
        long end = System.currentTimeMillis();
        log.info("around pay {} method cost {}ms", joinPoint.toShortString(), end - start);
        return obj;
    }
}
