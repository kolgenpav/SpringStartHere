package org.example.ch6.paramreturnvaluealter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.example.ch6.paramreturnvaluealter.services")
@EnableAspectJAutoProxy
public class ProjectConfig {

    /*Add aspect bean to context - @Aspect is not stereotype annotation!*/
    @Bean
    public LoggingAspect aspect() {
        return new LoggingAspect();
    }
}
