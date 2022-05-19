package org.example.ch5.prototype.sterotypebean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Both services depend on repository. Spring creates the different
 * bean instances for several creates.
 */
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        /*Bean should be singleton only if it is immutable - see final modifier in service classes*/
        var commentService = context.getBean(CommentService.class);
        var userService = context.getBean(UserService.class);
        /*Spring creates the different bean instances for several creates*/
        var bean1 = commentService.getCommentRepository();
        var bean2 = userService.getCommentRepository();
        System.out.println("bean1 == bean2: " + (bean1 == bean2));
    }
}
