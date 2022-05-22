package org.example.ch6.annotatedinterceptmeth.services;

import org.example.ch6.annotatedinterceptmeth.ToLog;
import org.example.ch6.annotatedinterceptmeth.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

/**
 * Only deleteComment annotated for aspect.
 */
@Service
public class CommentService {

    private final Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText());
    }

    /*Weave aspect to the method*/
    @ToLog
    public void deleteComment(Comment comment) {
        logger.info("Deleting comment: " + comment.getText());
    }

    public void editComment(Comment comment) {
        logger.info("Editing comment: " + comment.getText());
    }
}
