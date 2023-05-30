package com.example.spring_course.aop;

public class Student {
    private String nameSurmane;
    private int course;
    private double avgGrade;

    public Student(String nameSurmane, int course, double avgGrade) {
        this.nameSurmane = nameSurmane;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getNameSurmane() {
        return nameSurmane;
    }

    public void setNameSurmane(String nameSurmane) {
        this.nameSurmane = nameSurmane;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurmane='" + nameSurmane + '\'' +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
