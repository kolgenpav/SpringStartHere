package org.example.ch6.paramreturnvaluealter;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.example.ch6.paramreturnvaluealter.model.Comment;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    /*Aspect can throw the exception coming from intercepted method*/
    @Around("execution(* org.example.ch6.paramreturnvaluealter.services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();

        Comment newComment = new Comment();
        newComment.setAuthor("Other author");
        newComment.setText("Other text");
        Object[] newArguments = {newComment};
        logger.info("Method " + methodName
                + " with parameters " + Arrays.toString(arguments)
                + " really will execute with parameters "
        + Arrays.toString(newArguments));
        /*Alter method arguments*/
        Object returnedByMethod = joinPoint.proceed(newArguments);

        logger.info("Method executed and really returned " + returnedByMethod
        + " but it altered to FAILED");
        return "FAILED";
    }
}
