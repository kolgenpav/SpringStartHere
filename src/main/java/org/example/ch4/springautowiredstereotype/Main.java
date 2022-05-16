package org.example.ch4.springautowiredstereotype;

import org.example.ch4.springautowiredstereotype.model.Comment;
import org.example.ch4.springautowiredstereotype.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Comment publishing with dependencies injection by Spring.
 */
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Comment comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        /*Dependencies are auto injected by Spring*/
        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
