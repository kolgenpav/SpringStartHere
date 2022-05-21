package org.example.ch6.simpleaspect;

import org.example.ch6.simpleaspect.model.Comment;
import org.example.ch6.simpleaspect.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /*Returns proxy*/
        var service = context.getBean(CommentService.class);
        System.out.println(service.getClass().getName());  //org.example.ch6.simpleaspect.services.CommentService$$EnhancerBySpringCGLIB$$80604933

        Comment comment = new Comment();
        comment.setAuthor("Natasha");
        comment.setText("Demo comment");

        service.publishComment(comment);
    }
}
