package org.example.ch4.springexplicitly.repositories;

import org.example.ch4.springexplicitly.model.Comment;

public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText()
                + " of author: " + comment.getAuthor());
    }
}
