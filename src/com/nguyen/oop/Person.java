/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nguyen.oop;

/**
 *
 * @author acer
 */
public abstract class Person implements ModelInterface {
    private String name;
    private String age;
    private String school;
    private String classroom;

    public Person() {
    }

    public Person(String name, String age, String school, String classroom) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
    
    //Method không được ghi ở đây
    //Mà phải ghi ở một class khác gọi là Interface

}
