package org.example.ch3.beanselectwiringqualifier;

import org.example.ch3.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Use the beans registered explicitly with @Qualifier.
 */
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfigSelectBeanWiring.class);

        Person person = context.getBean(Person.class);
        System.out.println("Person's name: " + person.getName()
        +"\nPerson's parrot: " + person.getParrot());
    }
}
