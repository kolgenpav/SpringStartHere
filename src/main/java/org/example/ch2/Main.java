package org.example.ch2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Use the beans, registered explicitly in {@link ProjectConfig}.
 */
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//        Parrot p = new Parrot();

        /*For different beans of the same class - we can use method name*/
        Parrot p = context.getBean("parrot",Parrot.class);
        System.out.println(p.getName());
        /*For different beans of the same class - we can use method name or bean name*/
        System.out.println(context.getBean("miki",Parrot.class).getName());

        System.out.println(context.getBean(String.class));
        System.out.println(context.getBean(Integer.class));

        System.out.println(context.getBean(Parrot.class).getName());
    }
}
