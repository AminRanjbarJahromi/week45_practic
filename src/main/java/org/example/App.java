package org.example;

import org.example.Data.Studentrepository;
import org.example.Model.Gender;
import org.example.Model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Student student1 = new Student(1,"Amin", "Ranjbar",36, Gender.MALE);
        Student student2 = new Student(2,"Amin", "Ranjbar",36, Gender.MALE);

       /* System.out.println(student.getFullName());
        student.registerCourse(" JAVA SE");
        student.registerCourse(" c# ");
        System.out.println(student.courseInformation());



        System.out.println(student.toString());

        */
        Studentrepository studentRepository = new Studentrepository();
        studentRepository.add(student1);
        System.out.println(studentRepository.getSize());
        studentRepository.add(student2);
        System.out.println(studentRepository.getSize());


    }
}
