package org.example.Model;

public abstract class Person {

    private String firstName;
    private String lastname;
    private int age;

    //Enum
    private Gender gender;


    //constructors

    public Person ( String firsname, String lastname, int age, Gender gender ){

        this.firstName = firsname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
    }


    //method

    public String getFullName(){
        return firstName+ " "+ lastname;
    }

    public abstract String getInformation();


    //getter and setter


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender  gender) {
        this.gender = gender;
    }
}
