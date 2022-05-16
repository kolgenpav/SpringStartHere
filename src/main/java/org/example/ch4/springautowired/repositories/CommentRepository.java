package org.example.ch4.springautowired.repositories;

import org.example.ch4.springautowired.model.Comment;

/**
 * Repository of comments. We don't use @Component because it using for abstraction
 * have not sense.
 */
public interface CommentRepository {
    void storeComment(Comment comment);
}
