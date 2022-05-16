package org.example.ch4.springautowired.services;

import org.example.ch4.springautowired.model.Comment;
import org.example.ch4.springautowired.proxies.CommentNotificationProxy;
import org.example.ch4.springautowired.repositories.CommentRepository;
import org.springframework.stereotype.Component;

/**
 * Comment service. We autowired dependencies through constructor.
 * But we can also autowired it through fields and through setter (commented).
 * And we can also explicitly wire it in ProjectConfig with @Bean (see ch3).
 */
@Component
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
