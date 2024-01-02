package org.example;

import org.example.model.Course;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean(name = "course")
    public Course getCourse(){
        return new Course(1,"java",12345);
    }

}
