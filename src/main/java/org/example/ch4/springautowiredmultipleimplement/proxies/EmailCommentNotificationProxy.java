package org.example.ch4.springautowiredmultipleimplement.proxies;

import org.example.ch4.springautowiredmultipleimplement.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EMAIL")
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText()
                + " of author: " + comment.getAuthor());
    }
}
