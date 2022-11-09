package org.example;

public class Teacher extends  Person {

    private int teacherId;


    public Teacher(String firsname, String lastname, int age, Gender gender) {
        super(firsname, lastname, age, gender);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String getInformation() {
        return "Teacher Information : " + getFullName() + " " + teacherId ;
    }
}
