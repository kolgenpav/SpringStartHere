package org.example.ch4.springautowiredstereotype.proxies;

import org.example.ch4.springautowiredstereotype.model.Comment;
import org.springframework.stereotype.Component;

/**
 * Email sender proxy. We can use @Component across the application
 * to mark the beans as Spring’s managed components.
 */
@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText()
                + " of author: " + comment.getAuthor());
    }
}
