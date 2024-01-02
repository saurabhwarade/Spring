package org.example;


import org.example.model.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )

    {
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Course course = applicationContext.getBean("course", Course.class);
        System.out.println(course);

    }
}
