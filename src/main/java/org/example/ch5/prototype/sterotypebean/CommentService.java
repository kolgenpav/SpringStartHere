package org.example.ch5.prototype.sterotypebean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    /*Prototyped bean has not to be singleton - it is mutable - see no final modifier*/
    @Autowired
    private CommentRepository commentRepository;

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
