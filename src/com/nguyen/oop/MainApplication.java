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
public class MainApplication {
    
    public static void viewPerson(String personName) {
        System.out.println(personName);
    }
    
    public static void viewPerson(String personName, String age) {
        System.out.println(personName + " " + age);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Tính kế thừa: kế thừa tất cả những gì đã có ở lớp cha.
         * => Tiết kiệm bộ nhớ và biến
         * - Mỗi lần tạo một phân lớp như vậy, ví dụ như ta có 2 lớp Student(name, age, school, classroom,
         * point) và Teacher(name, age, school, classroom, salary)
         * -> biến 4 attributes name, age, school, classroom thành 1 phân lớp để cho kế thừa.
         * 
         * Tính đa hình (Polymorphism).
         * - Có những cái phương thức mặc dù trùng tên, nhưng khác dữ liệu đầu vào thì gọi là đa hình (overloading).
         */
//        Student student = new Student("SE1845", "FPTU", "Kiet", "20", 9);
//        student.viewProfile();
        viewPerson("Tran Tuan Kiet");
        viewPerson("Tran Tuan Kiet", "20");
    }
    
}
