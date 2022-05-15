package org.example.ch3.wiringbymethparam;

import org.example.ch3.Parrot;
import org.example.ch3.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfigWiringByMethodParameter {

    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Person person(Parrot parrot) {  //Dependency Injection - DI
        Person p = new Person();
        p.setName("Ella");
        /*Explicitly (manually) added dependency by parameter*/
        p.setParrot(parrot);
        return p;
    }
}
