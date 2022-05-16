package org.example.ch4.springexplicitly.proxies;

import org.example.ch4.springexplicitly.model.Comment;

/**
 * Proxy of comment sending.
 */
public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
