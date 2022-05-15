package org.example.ch3.wiringbymethcall;

import org.example.ch3.Parrot;
import org.example.ch3.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfigWiringByMethodCall {

    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Person person() {
        Person p = new Person();
        p.setName("Ella");
        /*Explicitly (manually) added dependency by method call -
          but second parrot does not create*/
        p.setParrot(parrot());
        return p;
    }
}
