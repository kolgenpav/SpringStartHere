package org.example.ch5.singleton.explicitlybean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring creates the single bean instance for several creates.
 */
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var bean1 = context.getBean(CommentService.class);
        var bean2 = context.getBean(CommentService.class);
        System.out.println("bean1 == bean2: " + (bean1 == bean2));
    }
}
