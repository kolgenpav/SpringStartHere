package org.example.ch4.springautowired.proxies;

import org.example.ch4.springautowired.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText()
                + " of author: " + comment.getAuthor());
    }
}
