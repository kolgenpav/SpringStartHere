package org.example.ch5.mutableisnotbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Service is a bean, but CommentProcessor and Comment - are not beans.
 * CommentProcessor is mutable. Two comments send with different CommentProcessor.
 */
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        /*Bean should be singleton only if it is immutable - see final modifier in service classes*/
        var commentService = context.getBean(CommentService.class);
        Comment comment = new Comment("some author", "some text");
        commentService.sendComment(comment);
        Comment newComment = new Comment("another author", "another text");
        commentService.sendComment(newComment);
    }
}
