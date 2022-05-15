package org.example.ch3.wiringbymethcall;

import org.example.ch3.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Use the beans registered explicitly with explicitly (manually) add
 * of their dependency with @Bean method call.
 */
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfigWiringByMethodCall.class);

        Person person = context.getBean(Person.class);
        /*If comment next operator parrot instance will e created automatically
         * while person create*/
//        Parrot parrot = context.getBean(Parrot.class);
        System.out.println("Person's name: " + person.getName()
//        +"\nParrot's name: " + parrot.getName()
                + "\nPerson's parrot: " + person.getParrot()); //Person's parrot is Parrot: Koko

        Person person1 = context.getBean(Person.class);
        person1.setName("Mike");
        /*Person1 automatically use created parrot bean from the context*/
        System.out.println("Person's name: " + person1.getName()
                + "\nPerson's parrot: " + person.getParrot());
    }
}
