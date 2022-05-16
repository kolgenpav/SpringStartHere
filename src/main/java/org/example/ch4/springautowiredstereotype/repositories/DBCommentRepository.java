package org.example.ch4.springautowiredstereotype.repositories;

import org.example.ch4.springautowiredstereotype.model.Comment;
import org.springframework.stereotype.Repository;

/**
 * Database repository for comments.We specify a class with @Repository
 * to indicate that they’re dealing with CRUD operations.
 */
@Repository
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText()
                + " of author: " + comment.getAuthor());
    }
}
