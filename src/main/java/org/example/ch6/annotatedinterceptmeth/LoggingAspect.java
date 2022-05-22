package org.example.ch6.annotatedinterceptmeth;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Aspect with annotation marked pointcut
 */
@Aspect
public class LoggingAspect {

    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    /*Aspect elements of beans annotated with @ToLog custom annotation*/
    @Around("@annotation(ToLog)")  //pointcut expression
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();

        logger.info("Method " + methodName
                + " with parameters " + Arrays.toString(arguments));
        joinPoint.proceed();
        logger.info("Method executed");
    }
}
