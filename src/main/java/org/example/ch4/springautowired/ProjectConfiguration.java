package org.example.ch4.springautowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.ch4.springautowired.proxies",
        "org.example.ch4.springautowired.repositories",
        "org.example.ch4.springautowired.services"})
public class ProjectConfiguration {
}
