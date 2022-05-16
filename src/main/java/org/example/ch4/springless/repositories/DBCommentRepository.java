package org.example.ch4.springless.repositories;

import org.example.ch4.springless.model.Comment;

public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText()
                + " of author: " + comment.getAuthor());
    }
}
