package org.example.ch4.springautowiredstereotype.model;

/**
 * Comment. We don't use @Component because we use only DI feature of Spring.
 */
public class Comment {
    private String author;
    private String text;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
