package org.example.ch4.springexplicitly.repositories;

import org.example.ch4.springexplicitly.model.Comment;

/**
 * Repository of comments.
 */
public interface CommentRepository {
    void storeComment(Comment comment);
}
