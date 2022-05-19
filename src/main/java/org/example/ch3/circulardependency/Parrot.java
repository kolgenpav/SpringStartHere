package org.example.ch3.circulardependency;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Parrot {

    private String name;
    private Person person;

    /*We can use @Lasy for initialize one of the beans lazily.
    Instead of fully initializing the bean, it will create a proxy
    to inject it into the other bean. The injected bean
    will only be fully created when it’s first needed -
    lazy instantiation of parrot dependency by Spring*/
    public Parrot(@Lazy Person person) {
        this.name = "Koko";
        this.person = person;
        System.out.println("Parrot created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot: " + name;
    }
}
