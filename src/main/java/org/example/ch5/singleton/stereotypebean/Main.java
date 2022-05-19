package org.example.ch5.singleton.stereotypebean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Both services depend on repository. Spring creates the single bean instance
 * for several repository creates.
 */
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        /*Bean should be singleton only if it is immutable - see final modifier in service classes*/
        var commentService = context.getBean(CommentService.class);
        var userService = context.getBean(UserService.class);
        var bean1 = commentService.getCommentRepository();
        var bean2 = userService.getCommentRepository();
        System.out.println("bean1 == bean2: " + (bean1 == bean2));
    }
}
