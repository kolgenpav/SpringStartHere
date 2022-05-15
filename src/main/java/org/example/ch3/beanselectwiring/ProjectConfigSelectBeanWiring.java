package org.example.ch3.beanselectwiring;

import org.example.ch3.Parrot;
import org.example.ch3.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Explicitly wiring with bean choosing by Person's parameter name. Don`t recommend
 * due to possible parameter refactoring rename.
 */
@Configuration
public class ProjectConfigSelectBeanWiring {

    @Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean
    public Person person(Parrot parrot2) {
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot2);
        return p;
    }
}
