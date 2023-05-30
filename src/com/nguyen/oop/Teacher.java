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
public class Teacher extends Person {
    int salary;

    public Teacher(int salary) {
        this.salary = salary;
    }

    public Teacher(int salary, String name, String age, String school, String classroom) {
        super(name, age, school, classroom);
        this.salary = salary;
    }
    
    public Teacher() {
    }
    //getter setter 
    /**
     * Getter : dùng để lấy giá trị hiện có của đối tượng
     * Setter : dùng để chỉnh sửa giá trị của đối tượng.
     */
    
}
