package org.example.ch4.springexplicitly.services;

import org.example.ch4.springexplicitly.model.Comment;
import org.example.ch4.springexplicitly.proxies.CommentNotificationProxy;
import org.example.ch4.springexplicitly.repositories.CommentRepository;

/**
 * Comment service. We wired dependencies explicitly in ProjectConfiguration.
 */
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository,
                          CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
