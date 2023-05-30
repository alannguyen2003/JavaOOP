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
public class Person {
    String name;
    String age;
    String school;
    String classroom;

    public Person() {
    }

    public Person(String name, String age, String school, String classroom) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.classroom = classroom;
    }
    
    public void viewProfile() {
        System.out.println(this);
    }
}
