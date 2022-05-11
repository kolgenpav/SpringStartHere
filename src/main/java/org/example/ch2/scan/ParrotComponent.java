package org.example.ch2.scan;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ParrotComponent {

    private String name;

    public ParrotComponent() {
    }

    @PostConstruct
    public void init(){
        this.name = "Kiki";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
