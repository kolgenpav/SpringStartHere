package org.example.ch4.springautowiredmultipleimplement.repositories;

import org.example.ch4.springautowiredmultipleimplement.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText()
                + " of author: " + comment.getAuthor());
    }
}
