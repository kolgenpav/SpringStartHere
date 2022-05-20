package org.example.ch5.mutableisbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Service has ApplicationContext dependency because it used
 * in the sendComment method for every time CommentProcessor creating.
 */
@Service
public class CommentService {
    /*Dependency with AnnotationConfigApplicationContext singleton*/
    @Autowired
    private ApplicationContext context;
    /* Next operator is a mistake - it creates a singleton for mutable object
     * - while Main.main run only one CommentProcessor message printed.
     * It can be compiled, but will be problems in multithreading environment*/
//    @Autowired
//    CommentProcessor commentProcessor;

    public void sendComment(Comment comment) {
        /*Getting the mutable bean in the method - it is right choice*/
        CommentProcessor commentProcessor = context.getBean(CommentProcessor.class);
        commentProcessor.setComment(comment);
        /*Alter comment*/
        commentProcessor.processComment();
        commentProcessor.validateComment();
        /*Get modified comment*/
        comment = commentProcessor.getComment();
        System.out.println("Sending comment " + comment);
    }
}
