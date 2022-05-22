package org.example.ch6.aspectchain;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Logging aspect with annotation marked pointcut. By default, Spring does not guarantee
 * the order in which two aspects in the same execution chain are called. If you
 * need to define the aspects’ execution order, you can use the @Order annotation.
 */
@Aspect
@Order(2)
public class LoggingAspect {

    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    /*Aspect elements of beans annotated with @ToLog custom annotation*/
    @Around(value = "@annotation(ToLog)")  //pointcut expression
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Logging Aspect: Calling the intercepted method");
        Object returnedValue = joinPoint.proceed();
        logger.info("LoggingAspect: method executed and returned: " + returnedValue);
        return returnedValue;
    }
}
