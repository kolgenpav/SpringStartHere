package org.example.ch4.springautowired.proxies;

import org.example.ch4.springautowired.model.Comment;

/**
 * Proxy of comment sending. We don't use @Component because it using for abstraction
 * have not sense.
 */
public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
