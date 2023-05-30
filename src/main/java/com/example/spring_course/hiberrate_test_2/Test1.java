package com.example.spring_course.hiberrate_test_2;

import com.example.spring_course.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure(" com.example.spring_course.hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();


        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Zaur", "Tregulov", "IT", 500);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
        }finally {
            factory.close();
        }

    }
}
