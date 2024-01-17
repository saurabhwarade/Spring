package org.example.Dao;

import org.example.Model.Student;
import org.example.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDao {
    public void addStudent(Student student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();


    }

    public Student login(Student student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        //String sql = "from student where email=:email and paassword=:password";
        Query query = session.createQuery("from student where email=:email and password=:pass");
        query.setParameter("email",student.getEmail());
        query.setParameter("pass",student.getPassword());
        student=(Student) query.uniqueResult();
        session.close();
        return student;
    }

    public List<Student> getProfileStudent() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from student ");
        List<Student> list = query.list();
        session.close();
        return list;
    }
}
