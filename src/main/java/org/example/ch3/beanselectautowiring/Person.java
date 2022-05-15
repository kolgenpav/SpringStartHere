package org.example.ch3.beanselectautowiring;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private Parrot parrot;

    public Person(Parrot parrot2) {
        this.name = "Ella";
        this.parrot = parrot2;
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
