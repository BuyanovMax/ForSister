package com.example.spring_course;

import com.example.spring_course.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure()
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
