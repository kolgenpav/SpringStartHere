package org.example.ch6.adviceannotations;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Aspect with annotation marked pointcut and simple advice annotations.
 */
@Aspect
public class LoggingAspect {

    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    /*Calls the method defining the aspect logic after the method
      successfully returns, and provides the returned value as a parameter
      to the aspect method. The aspect method isn’t called
      if the intercepted method throws an exception
    @AfterReturning(value = "@annotation(ToLog)", returning = "returnedValue")  //pointcut expression
    public void log(Object returnedValue) throws Throwable {
        logger.info("Method executed and returned " + returnedValue);
    }
*/

    /*Calls the method defining the aspect logic before the execution
      of the intercepted method
    @Before(value = "@annotation(ToLog)")  //pointcut expression
    public void log() throws Throwable {
        logger.info("Method will be executed");
    }
*/

    /*Calls the method defining the aspect logic only after the intercepted method
      execution, whether the method successfully returned or threw an exception
    @After(value = "@annotation(ToLog)")  //pointcut expression
    public void log() throws Throwable {
        logger.info("Method executed");
    }
*/

    /*Calls the method defining the aspect logic if the intercepted method
      throws an exception, and provides the exception instance as a parameter
      to the aspect method*/
    @AfterThrowing(value = "@annotation(ToLog)", throwing = "exception")  //pointcut expression
    public void log(Object exception) throws Throwable {
        logger.info("Method executed with exception " + ((Exception)exception).getMessage());
    }
}
