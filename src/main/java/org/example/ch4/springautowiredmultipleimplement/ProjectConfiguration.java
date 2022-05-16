package org.example.ch4.springautowiredmultipleimplement;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.ch4.springautowiredmultipleimplement.proxies",
        "org.example.ch4.springautowiredmultipleimplement.repositories",
        "org.example.ch4.springautowiredmultipleimplement.services"})
public class ProjectConfiguration {
}
