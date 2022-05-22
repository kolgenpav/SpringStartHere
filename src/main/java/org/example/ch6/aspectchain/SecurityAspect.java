package org.example.ch6.aspectchain;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import java.util.logging.Logger;

/**
 * Security aspect with annotation marked pointcut. By default, Spring does not guarantee
 * the order in which two aspects in the same execution chain are called. If you
 * need to define the aspects’ execution order, you can use the @Order annotation.
 */
@Aspect
@Order(1)
public class SecurityAspect {
    private final Logger logger = Logger.getLogger(SecurityAspect.class.getName());

    @Around(value = "@annotation(ToLog)")
    public Object secure(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Security Aspect: Calling the intercepted method");

        Object returnedValue = joinPoint.proceed();
        logger.info("Security Aspect: Method executed and returned "
                + returnedValue);
        return returnedValue;
    }
}
