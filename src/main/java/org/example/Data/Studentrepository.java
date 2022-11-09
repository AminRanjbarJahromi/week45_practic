package org.example.Data;

import org.example.Model.Student;

import java.util.Arrays;

public class Studentrepository implements IStudentRepository {

    private Student[] students = new Student[0];


    @Override
    public int getSize() {
        return students.length;
    }

    @Override
    public void clear() {
        students = new Student[0];


    }

    @Override
    public Student[] findAll() {
        return Arrays.copyOf(students, students.length);
    }

    @Override
    public Student findByStudentId(int studentId) {
        for (Student studentElement : students) {
            if (studentElement.getStudentId() == studentId) {
                return studentElement;
            }
        }
        return null;
    }

    @Override
    public boolean add(Student student) {
        Student result = findByStudentId(student.getStudentId());
        if (result != null) {
            return false;
        }

        return true;
    }



}
