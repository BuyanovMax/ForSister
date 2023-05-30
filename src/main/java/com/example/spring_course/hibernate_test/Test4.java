package com.example.spring_course.hibernate_test;

import com.example.spring_course.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure(" com.example.spring_course.hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();


        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee emp = session.get(Employee.class, 1);
//            emp.setSalary(1500);

            session.createQuery("update Employee set salary=1000 " +
                    "where name='Aleksandr'").executeUpdate();




            session.getTransaction().commit();
            System.out.println("Done!!");

        }finally {
            factory.close();
        }

    }
}
