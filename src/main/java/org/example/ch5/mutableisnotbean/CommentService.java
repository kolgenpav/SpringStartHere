package org.example.ch5.mutableisnotbean;

import org.springframework.stereotype.Service;

/**
 * Explicitly use Comment Processor - that is not a bean.
 */
@Service
public class CommentService {

    public void sendComment(Comment comment) {
        CommentProcessor commentProcessor = new CommentProcessor();
        commentProcessor.setComment(comment);
        /*Alter comment*/
        commentProcessor.processComment();
        commentProcessor.validateComment();
        /*Get modified comment*/
        comment = commentProcessor.getComment();
        System.out.println("Sending comment " + comment + " with CommentProcessor "
                + commentProcessor.hashCode());
    }
}
