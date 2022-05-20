package org.example.ch5.mutableisbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Mutable class - has prototype scope. Class is a Spring bean.
 * It is injected with a CommentRepository dependency by Spring.
 */
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {

    @Autowired
    CommentRepository commentRepository;
    private Comment comment;

    public CommentProcessor() {
        System.out.println("CommentProcessor created.");
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void processComment(){
        System.out.println("Some comment attributes altering");;
    }

    public void validateComment() {
        System.out.println("Validating and changing the comment attributes");
    }
}
