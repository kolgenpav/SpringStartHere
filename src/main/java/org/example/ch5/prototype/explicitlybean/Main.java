package org.example.ch5.prototype.explicitlybean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring creates the different bean instances for several creates.
 */
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var bean1 = context.getBean(CommentService.class);
        var bean2 = context.getBean(CommentService.class);
        System.out.println("bean1 == bean2: " + (bean1 == bean2));
    }
}
