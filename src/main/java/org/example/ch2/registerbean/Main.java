package org.example.ch2.registerbean;

import org.example.ch2.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

/**
 * Use the run-time programmatically registered beans.
 */
public class Main {
    public static void main(String[] args) {

        var context =
                new AnnotationConfigApplicationContext(ProjectConfigRegisterBean.class);

        Supplier<Parrot> parrotSupplier = () -> {
            var parrot = new Parrot();
            parrot.setName("Kiki");
            return parrot;
        };

        context.registerBean("parrto1",Parrot.class,parrotSupplier,
                bc -> bc.setPrimary(true));

        System.out.println(context.getBean(Parrot.class).getName());
    }
}
