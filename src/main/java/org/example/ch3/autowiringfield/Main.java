package org.example.ch3.autowiringfield;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Using bean @Autowired at field demo. It is not recommended for production
 * because autowired field can not be final and it’s more difficult to manage
 * the value yourself at initialization.
 */
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfigAutowiring.class);

        Person person = context.getBean(Person.class);
        System.out.println("Person's name: " + person.getName()
                + "\nPerson's parrot: " + person.getParrot());
    }
}
