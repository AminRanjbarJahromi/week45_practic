package org.example.model;

import org.example.Model.Gender;
import org.example.Model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentTest {

    Student testObject;

    @BeforeEach
    public void setup(){
        testObject = new Student(1, "amin","ranjbar", 30, Gender.MALE);
    }

    @Test
    public void test_create_studentObject_successfully(){
        Assertions.assertEquals(1, testObject.getStudentId());
        Assertions.assertEquals("amin", testObject.getFirstName());
        Assertions.assertNotEquals("AMIN", testObject.getFirstName());

    }
    @Test
    public void test_registerCourse_return_size_1(){
       testObject.registerCourse("Java SE");
       Assertions.assertEquals(1, testObject.getCourses().length);

    }

}
