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
         * AEIO
         * Tính đóng gói (Encapsulation):
         * - các phương thức hoặc thuộc tính khi không được cho phép thì sẽ không thể dùng được trong 1 phạm vi nhất định
         * - Sẽ quy định các class cùng 1 chức năng sẽ vào chung 1 package.
         * VD: Class liên quan đến mô tả đối tượng -> model package, entity package,...
         * Access Modifier: 
         *      + public : có thể được truy cập ở mọi nơi trong toàn bộ source code.
         *      + protected : Có thể được truy cập được nhưng chỉ truy cập được trong phạm vi 1 package nào đó.
         *      + default (không có) : tương tự như protected.
         *      + private : chỉ sử dụng được trong class duy nhất, là chính class đó luôn, không 1 ai được xài hết!!.
         * 
         * Tính trừu tượng (Asbtraction) : 
         * - Không tồn tại để sử dụng.
         * Từ khóa abstract: khi từ khóa này xuất hiện, class/interface sẽ được đánh dấu là: lớp trừu tượng.
         * Bất cứ phương thức nào chứa từ khóa abstract thì đều biến class đó thành class abstract.
         * Class Abstract luôn luôn là class cha trong tính kế thừa.
         * Hoặc Interface phải được sử dụng bởi 1 class nào đó.!!
         * Interface: là một giao diện gồm các chức năng dùng chung nào đó mà các class khác cần phải dùng.
         */
        Student student = new Student();
        student.setName("Trần Tuấn Kiệt");
        student.setAge("20");
        student.setSchool("FPT");
        student.setClassroom("SE1845");
        student.setPoint(9);
        student.viewProfile();
        
        Teacher teacher = new Teacher();
        teacher.setName("Nguyễn Trí Thông");
        teacher.setClassroom("SE1845");
        teacher.setSalary(40);
        teacher.viewProfile();
        
        /** 
         * Bài 2:
         * Write a Java application to manange the list of employees:
         * The employee has 2 roles: Manager and Employee
         *      - Employee has these attributes: code, name, age, address, department, salary per day, date at work.
         *      - Manager has these attributes: code, name, age, address, department, total salary, projects.
         * You will have a menu following these functions:
         * 1. Print out the list of Employees.
         * 2. Print out the list of Managers.
         * 3. Update employee's department by their code.
         * 4. Add new project to attribute projects of manager, by their code.
         * 5. Print out the salary of employee based on their code.
         * 6. Print out the rate of manager's salary, 
         *      - If its salary is over 5000, print High.
         *      - If its salary is over 2000 và less than 5000, print Medium
         *      - If its salary is less than 2000, print Low.
         * 7. Print out all the projects of a manager based on the manager's code, 
         * if a manager has no project, delete a manager from the list.!
         * 
         * if the user type 0 on the menu, exit program automation!!!
         * Bữa sau có trả bài!
         */
    }
}
