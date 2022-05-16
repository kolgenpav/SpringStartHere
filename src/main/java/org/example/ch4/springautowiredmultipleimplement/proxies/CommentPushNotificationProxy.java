package org.example.ch4.springautowiredmultipleimplement.proxies;

import org.example.ch4.springautowiredmultipleimplement.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * We can use @Primary to override default implementation of interface
 * shipped with system.
 */
@Component
//@Primary
@Qualifier("PUSH")
public class CommentPushNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment: " + comment.getText()
                + " of author: " + comment.getAuthor());
    }
}
