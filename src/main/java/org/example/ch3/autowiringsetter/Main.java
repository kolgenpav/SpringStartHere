package org.example.ch3.autowiringsetter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Using bean @Autowired at setter demo. It is not recommended for production
 * because autowired field can not be final and it doesn’t help you in making the
 * testing easier.
 */
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfigAutowiring.class);
        Person person = context.getBean(Person.class);

        System.out.println("Person's name: " + person.getName()
                + "\nPerson's parrot: " + person.getParrot());
    }
}
