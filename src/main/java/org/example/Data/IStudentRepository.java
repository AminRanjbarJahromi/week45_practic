package org.example.Data;

import org.example.IBaseRepository;
import org.example.Model.Student;

import java.util.Arrays;

public interface IStudentRepository extends IBaseRepository {

    int MAX_STUDENTS = 9998;



    Student[] findAll();

    Student findByStudentId(int studentId);

    boolean add( Student student);

    static void printStudent(Student[] students){
        for(Student student : students ){
            System.out.println(student.getInformation());
        }
    }

    default Student[] addToArray(Student[] source, Student newElement) {
        Student[] newArray = Arrays.copyOf(source, source.length + 1);
        newArray[newArray.length - 1] = newElement;
        return newArray;
    }


}
