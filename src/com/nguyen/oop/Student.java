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
public class Student extends Person{
    //Từ khóa extends : kế thừa 
    //implements : Áp dụng (màn hình, các phương thức mà không tồn tại attributes) => Tính trừu tượng hóa (abstraction)
    int point;

    public Student(int point) {
        this.point = point;
    }

    public Student(String classroom, String school, String name, String age, int point) {
        super(name, age, school, classroom);
        this.point = point;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + this.name + ", age=" + this.age + ", school=" + this.school + ", classroom=" + this.classroom + ", point=" + this.point + "}";
    }
    
    //viewProfile
    
    
}
