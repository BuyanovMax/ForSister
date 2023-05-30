package com.example.spring_course.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsAdvice() {
//        System.out.println("beforeGetStudentsAdvice : логиреуем получение" +
//                " списка студентов перед методом getStudents");
//    }


//    @AfterReturning(pointcut = "execution(* getStudents())",
//    returning = "students")
//    public void afterReturningGetStudentsAdvice(List<Student> students) {
//
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurmane();
//        nameSurname = "Mr." + nameSurname;
//        firstStudent.setNameSurmane(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//
//        System.out.println("afterReturningGetStudentsAdvice : логиреуем получение" +
//                " списка студентов после работы с методом getStudents");
//    }


//    @AfterThrowing(pointcut = "execution(* getStudents())",
//            throwing = "exception")
//    public void afterThrowingGetStudentsAdvice(Throwable exception) {
//        System.out.println("afterThrowingGetStudentsAdvice: логируем выброс исключения" + exception);
//    }


//    @After("execution(* getStudents())")
//    public void afterGetStudentsLoggingAdvice() {
//        System.out.println("afterGetStudentsLoggingAdvice:" +
//                " логируем нормальное окончание работы метода или выброс исключения");
//    }




}
