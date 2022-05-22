package org.example.ch6.annotatedinterceptmeth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Custom annotation to mark method for logging.
 */
@Retention(RetentionPolicy.RUNTIME) //someone can intercept annotations in runtime (default policy is CLASS)
@Target(ElementType.METHOD) //if it is not used at all - any element will be targeted
public @interface ToLog {
}
