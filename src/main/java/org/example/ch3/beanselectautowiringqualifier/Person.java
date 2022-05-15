package org.example.ch3.beanselectautowiringqualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Inject Parrot bean with choosing by @Qualifier. Recommended case.
 */
@Component
public class Person {
    private String name;
    private Parrot parrot;

    public Person(@Qualifier("parrot2") Parrot parrot) {
        this.name = "Ella";
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}
