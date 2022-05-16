package org.example.ch4.springexplicitly.proxies;

import org.example.ch4.springexplicitly.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText()
                + " of author: " + comment.getAuthor());
    }
}
