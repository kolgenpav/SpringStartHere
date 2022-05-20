package org.example.ch5.mutableisnotbean;

/**
 * Mutable class - prototype scope candidate. Class is not a Spring bean.
 * It is explicitly used in CommentService.
 */
public class CommentProcessor {
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
