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
public class Student extends Person {
    //Từ khóa extends : kế thừa 
    //implements : Áp dụng (màn hình, các phương thức mà không tồn tại attributes) => Tính trừu tượng hóa (abstraction)
    private int point;

    public Student(int point) {
        this.point = point;
    }

    public Student(String classroom, String school, String name, String age, int point) {
        super(name, age, school, classroom);
        //Từ khóa super: 
        /**
         * Từ khóa super() chỉ đươc dùng để kế thừa phương thức từ lớp cha (nếu có)!!
         */
        this.point = point;
    }

    public Student() {
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
    
    //Getter và Setter: 
    /**
     * Getter: Là phương thức để lấy giá trị của 1 attribute nào đó.
     * Setter: Là phương thức để update giá trị của 1 attribute.
     * Cấu trúc của Getter và Setter là:
     *      + Getter: get + Tên attribute chữ đầu viết hoa
     *          VD: attribute "name" -> Getter: getName();
     *      + Setter: set + tên Attribute chữ đầu viết hoa
     *          VD: attribute "name" -> Setter: setName(tham số truyền vào để update);
     * Getter và Setter có thể được truy cập ở bất cứ đâu, miễn là có biến thuộc class đó.!!!
     * @return 
     */

    @Override
    public String toString() {
        return "Student{" + "name=" + this.getName() + ", age=" + this.getAge() + ", school=" + this.getSchool() + ", classroom=" + this.getClassroom() + ", point=" + this.point + "}";
    }
    
    //viewProfile

    @Override
    public void viewProfile() {
        System.out.println(this);
    }
    
    
}
