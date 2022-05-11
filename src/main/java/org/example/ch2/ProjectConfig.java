package org.example.ch2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    String hello(){
        return "hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }

    /*We can use in the main name instead of the method name*/
    @Bean(name = "miki")
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }

    /*We can use in the main only class for Primary bean*/
    @Bean
    @Primary
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("Someone");
        return p;
    }
}
