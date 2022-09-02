package org.genspark;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "org.genspark")
@ImportResource( {"classpath:spring.xml"})
public class AppConfig {

    @Bean
    public Student nameId() {
        Student std = new Student();
        std.setId(0);
        std.setName("John");
        return std;
    }

}
