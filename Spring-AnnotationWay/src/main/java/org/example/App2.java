package org.example;


import org.example.model.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2
{
    public static void main( String[] args )

    {
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(Course.class);
        Course course = applicationContext.getBean(Course.class);
        System.out.println(course);

    }
}
