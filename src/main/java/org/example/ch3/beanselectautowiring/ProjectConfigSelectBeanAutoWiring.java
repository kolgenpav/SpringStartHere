package org.example.ch3.beanselectautowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Explicitly wiring with bean choosing by Person's parameter name.
 * Person bean aut scanned.
 */
@Configuration
@ComponentScan(basePackages = "org.example.ch3.beanselectautowiring")
public class ProjectConfigSelectBeanAutoWiring {

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

    //Person bean will be auto scanned.
}
