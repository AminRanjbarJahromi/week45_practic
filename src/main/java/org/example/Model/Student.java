package org.example.Model;

import java.util.Arrays;

public class Student extends Person {

    public static final int MAX_COURSES = 5;

    //field
    private int studentId;
    private String[] courses;

    //constructors

    public Student (int studentId, String firsName, String lastname, int age, Gender gender){
        super(firsName,lastname,age,gender);
        this.studentId = studentId;

    }



    //methods
    public void registerCourse(String course){
        if( courses == null) courses = new String[0];
        if(course.length() > MAX_COURSES){
            throw new IllegalArgumentException(" number of register course should not be greater than  " + MAX_COURSES);
        }

        String[] newArray = Arrays.copyOf(courses, courses.length + 1);
        newArray[ newArray.length - 1] = course;
        courses = newArray;

    }

    public String courseInformation(){
        if( courses == null || courses.length == 0){
            return "__";
        }
        /* String result = "";
        for (String course : courses){
            result+= course + " ";
        }
        return result;

         */
        StringBuilder stringBuilder = new StringBuilder();
        for (String course : courses){
            stringBuilder.append(course).append(" , ");
        }
        return stringBuilder.toString();

    }

    public String getInformation(){
        return " student Id " + studentId + " Name : " + getFullName();
    }

    @Override
    public String getFullName(){
        return " Full Name : " + getFirstName() + " " + getFirstName() + " ";
    }

    /* @Override
    public String toString(){
        return " studnt Id : " + studentId + " student name : " + getFirstName() + " " + getLastname();
    }

     */

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }

// setter and getter


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}
