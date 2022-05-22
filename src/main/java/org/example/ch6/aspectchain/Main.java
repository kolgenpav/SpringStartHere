package org.example.ch6.aspectchain;

import org.example.ch6.aspectchain.model.Comment;
import org.example.ch6.aspectchain.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /*Returns proxy*/
        var service = context.getBean(CommentService.class);
        System.out.println(service.getClass().getName());  //org.example.ch6.annotatedinterceptmeth.services.CommentService$$EnhancerBySpringCGLIB$$80604933

        Comment comment = new Comment();
        comment.setAuthor("Natasha");
        comment.setText("Demo comment");

        service.publishComment(comment);
    }
}
