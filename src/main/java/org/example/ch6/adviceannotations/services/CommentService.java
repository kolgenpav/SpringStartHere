package org.example.ch6.adviceannotations.services;

import org.example.ch6.adviceannotations.ToLog;
import org.example.ch6.adviceannotations.model.Comment;
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
//        throw new IllegalArgumentException("Exception from publishComment");
        logger.info("Publishing comment: " + comment.getText());
        return "SUCCEED";
    }
}
