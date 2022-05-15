package org.example.ch3.autowiringconstruct;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Using bean @Autowired at constructor demo. The most recommended approach.
 */
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfigAutowiring.class);
        Person person = context.getBean(Person.class);

        System.out.println("Person's name: " + person.getName()
                + "\nPerson's parrot: " + person.getParrot());
    }
}
