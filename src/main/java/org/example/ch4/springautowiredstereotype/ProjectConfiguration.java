package org.example.ch4.springautowiredstereotype;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.ch4.springautowiredstereotype.proxies",
        "org.example.ch4.springautowiredstereotype.repositories",
        "org.example.ch4.springautowiredstereotype.services"})
public class ProjectConfiguration {
}
