package org.example.ch3.wiringbymethparam;

import org.example.ch3.Person;
import org.example.ch3.wiringbymethcall.ProjectConfigWiringByMethodCall;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Use the beans registered explicitly with explicitly (manually) add
 * of their dependency with @Bean method parameter.
 */
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfigWiringByMethodParameter.class);

        Person person = context.getBean(Person.class);
        /*Parrot bean created automatically*/
        System.out.println("Person's name: " + person.getName()
                + "\nPerson's parrot: " + person.getParrot()); //Person's parrot is Parrot: Koko

        Person person1 = context.getBean(Person.class);
        person1.setName("Mike");
        /*Person1 automatically use created parrot bean from the context*/
        System.out.println("Person's name: " + person1.getName()
                + "\nPerson's parrot: " + person.getParrot());
    }
}
