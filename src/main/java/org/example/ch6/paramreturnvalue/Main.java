package org.example.ch6.paramreturnvalue;

import org.example.ch6.paramreturnvalue.model.Comment;
import org.example.ch6.paramreturnvalue.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /*Returns proxy*/
        var service = context.getBean(CommentService.class);
        System.out.println(service.getClass().getName());  //org.example.ch6.paramreturnvalue.services.CommentService$$EnhancerBySpringCGLIB$$80604933

        Comment comment = new Comment();
        comment.setAuthor("Natasha");
        comment.setText("Demo comment");

        String value = service.publishComment(comment);
    }
}
