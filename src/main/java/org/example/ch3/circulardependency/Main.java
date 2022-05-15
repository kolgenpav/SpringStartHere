package org.example.ch3.circulardependency;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The circular dependency exception demo.
 * Error creating bean with name 'parrot': Requested bean is currently in creation:
 * Is there an unresolvable circular reference?
 *
 * We can avoid exception by using @Lazy annotation for bean's constructor parameter.
 * BUT CIRCULAR DEPENDENCIES IS BAD DESIGN.
 */
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfigAutowiring.class);
        Person person = context.getBean(Person.class);

        System.out.println("Person's name: " + person.getName()
                + "\nPerson's parrot: " + person.getParrot());
    }
}
