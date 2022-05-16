package org.example.ch4.springless.repositories;

import org.example.ch4.springless.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
