package org.example.ch3.beanselectautowiringqualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Use the beans registered explicitly with Person bean parameter using.
 */
public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfigSelectBeanAutoWiringQualifier.class);

        Person person = context.getBean(Person.class);
        System.out.println("Person's name: " + person.getName()
        +"\nPerson's parrot: " + person.getParrot());
    }
}
