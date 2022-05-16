package org.example.ch4.springautowiredstereotype.repositories;

import org.example.ch4.springautowiredstereotype.model.Comment;

/**
 * Repository of comments. We don't use @Repository because it's using for abstraction
 * have not sense.
 */
public interface CommentRepository {
    void storeComment(Comment comment);
}
