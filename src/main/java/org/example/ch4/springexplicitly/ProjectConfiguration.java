package org.example.ch4.springexplicitly;

import org.example.ch4.springexplicitly.proxies.CommentNotificationProxy;
import org.example.ch4.springexplicitly.proxies.EmailCommentNotificationProxy;
import org.example.ch4.springexplicitly.repositories.CommentRepository;
import org.example.ch4.springexplicitly.repositories.DBCommentRepository;
import org.example.ch4.springexplicitly.services.CommentService;
import org.springframework.context.annotation.Bean;

public class ProjectConfiguration {

    @Bean
    public CommentRepository commentRepository() {
        return new DBCommentRepository();
    }

    @Bean
    public CommentNotificationProxy commentNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }

    @Bean
    public CommentService commentService(CommentRepository commentRepository,
                                         CommentNotificationProxy commentNotificationProxy) {
        return new CommentService(commentRepository, commentNotificationProxy);
    }
}
