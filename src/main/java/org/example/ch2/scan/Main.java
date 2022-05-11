package org.example.ch2.scan;

import org.example.ch2.Parrot;
import org.example.ch2.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfigScan.class);

        /*Bean was scanned by @Component annotation - only one instance
          of the same class can be added*/
        ParrotComponent p = context.getBean(ParrotComponent.class);
        System.out.println(p.getName());
    }
}
