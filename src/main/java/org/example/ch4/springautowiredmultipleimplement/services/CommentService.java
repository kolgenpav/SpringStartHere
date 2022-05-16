package org.example.ch4.springautowiredmultipleimplement.services;

import org.example.ch4.springautowiredmultipleimplement.model.Comment;
import org.example.ch4.springautowiredmultipleimplement.proxies.CommentNotificationProxy;
import org.example.ch4.springautowiredmultipleimplement.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Comment service. We autowired dependencies through constructor.
 * But we can also autowired it through fields and through setter (commented).
 * And we can also explicitly wire it in ProjectConfig with @Bean (see ch3).
 * Also, we choose proxy implementation by @Qualifier.
 */
@Component
public class CommentService {

    //    @Autowired //But field can not be final
    private final CommentRepository commentRepository;
    //    @Autowired //But field can not be final
    private final CommentNotificationProxy commentNotificationProxy;

    /*@Autowired is optional because we have only one constructor in the class*/
    public CommentService(CommentRepository commentRepository,
                          @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
