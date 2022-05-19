package org.example.ch5.singleton.eagerlazyinstantiation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The difference for eager and lazy bean creation y Spring.
 */
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        /*Spring creates the single EAGER bean instance without explicitly request
         * - we will see constructor message, but does not create LAZY bean!*/
        System.out.println("Before retrieving beans");
        /*Next operator does not create bean!!! It returns reference to bean
          created with context*/
        var eagerService = context.getBean(CommentService.class);
        /*Next operator creates bean because of it was not created with context*/
        var lazyService = context.getBean(LazyCommentService.class);
        System.out.println("After retrieving beans");
    }
}
