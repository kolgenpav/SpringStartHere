package org.example.ch6.aspectchain.services;

import org.example.ch6.aspectchain.ToLog;
import org.example.ch6.aspectchain.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

/**
 * Only deleteComment annotated for aspect.
 */
@Service
public class CommentService {

    private final Logger logger = Logger.getLogger(CommentService.class.getName());

    /*Weave aspect to the method*/
    @ToLog
    public String publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText());
        return "SUCCESS";
    }
}
