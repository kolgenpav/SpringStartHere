package org.example.ch3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Use the beans registered explicitly without their dependency add.
 */
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);
        System.out.println("Person's name: " + person.getName()
        +"\nParrot's name: " + parrot.getName()
        +"\nPerson's parrot: " + person.getParrot()); //Person's parrot is null
    }
}
