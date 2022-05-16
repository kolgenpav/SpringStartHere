package org.example.ch4.springautowiredstereotype.proxies;

import org.example.ch4.springautowiredstereotype.model.Comment;

/**
 * Proxy of comment sending. We don't use @Component because it using for abstraction
 * have not sense.
 */
public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
