package org.example.ch4.springless;

import org.example.ch4.springless.model.Comment;
import org.example.ch4.springless.proxies.CommentNotificationProxy;
import org.example.ch4.springless.proxies.EmailCommentNotificationProxy;
import org.example.ch4.springless.repositories.CommentRepository;
import org.example.ch4.springless.repositories.DBCommentRepository;
import org.example.ch4.springless.services.CommentService;

/**
 * Comment publishing with explicitly dependencies injection.
 */
public class Main {
    public static void main(String[] args) {
        CommentRepository commentRepository = new DBCommentRepository();
        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();
        CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);

        Comment comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");
        commentService.publishComment(comment);
    }
}
