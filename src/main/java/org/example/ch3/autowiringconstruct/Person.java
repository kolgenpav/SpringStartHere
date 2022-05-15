package org.example.ch3.autowiringconstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;
    /*Field may be final*/
    private Parrot parrot;

    @Autowired
    public Person(Parrot parrot) {
        this.name = "Ella";
        this.parrot=parrot;
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
