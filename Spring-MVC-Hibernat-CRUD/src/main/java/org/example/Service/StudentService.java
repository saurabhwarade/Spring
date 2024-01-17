package org.example.Service;

import org.example.Dao.StudentDao;
import org.example.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public Student login(Student student) {
        return studentDao.login(student);
    }

    public List<Student> getProfileStudent() {
        return studentDao.getProfileStudent();
    }
}
