package org.example;

import org.example.Model.Gender;
import org.example.Model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Student student = new Student(1,"Amin", "Ranjbar",36, Gender.MALE);
       /* System.out.println(student.getFullName());
        student.registerCourse(" JAVA SE");
        student.registerCourse(" c# ");
        System.out.println(student.courseInformation());

        */

        System.out.println(student.toString());


    }
}
