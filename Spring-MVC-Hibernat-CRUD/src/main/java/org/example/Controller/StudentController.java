package org.example.Controller;

import org.example.Model.Student;
import org.example.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/student")
    public ModelAndView addStudent(@ModelAttribute Student student) {
        ModelAndView modelAndView = new ModelAndView();
        studentService.addStudent(student);
        modelAndView.setViewName("login");
        modelAndView.addObject("data", student);
        return modelAndView;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView loginStudent(@ModelAttribute Student student) {
        ModelAndView modelAndView = new ModelAndView();
        Student login = studentService.login(student);
        if (login != null) {
            modelAndView.setViewName("home");
            modelAndView.addObject("student",student);
        }
        else {
            modelAndView.setViewName("login");
            modelAndView.addObject("msg","Invalid credential");
        }

        return modelAndView;
    }
    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public ModelAndView getProfileDetail(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("profile");
        List<Student> profileStudent = studentService.getProfileStudent();
        modelAndView.addObject("data",profileStudent);

        return modelAndView;
    }
}
