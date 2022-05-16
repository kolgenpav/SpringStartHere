package org.example.ch4.springautowiredstereotype.services;

import org.example.ch4.springautowiredstereotype.model.Comment;
import org.example.ch4.springautowiredstereotype.proxies.CommentNotificationProxy;
import org.example.ch4.springautowiredstereotype.repositories.CommentRepository;
import org.springframework.stereotype.Service;

/**
 * Comment service. We autowired dependencies through constructor.
 * But we can also autowired it through fields and through setter (commented).
 * And we can also explicitly wire it in ProjectConfig with @Bean (see ch3).
 * We specify a class with @Service to indicate that they’re holding the business logic.
 */
@Service
public class CommentService {

    //    @Autowired //But field can not be final
    private final CommentRepository commentRepository;
    //    @Autowired //But field can not be final
    private final CommentNotificationProxy commentNotificationProxy;

    /*@Autowired is optional because we have only one constructor in the class*/
    public CommentService(CommentRepository commentRepository,
                          CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
