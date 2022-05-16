package org.example.ch4.springless.proxies;

import org.example.ch4.springless.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
