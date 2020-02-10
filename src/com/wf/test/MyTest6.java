package com.wf.test;

public class MyTest6 {
    public static void main(String[] args) {
        /*Rectangle rectangle = new Rectangle(10,20,"黄色");
        rectangle.showAll();
        Circle circle = new Circle(10,"蓝色");
        circle.showAll();*/
        SalariedEmployee salariedEmployee = new SalariedEmployee("张三",6000,2);
        System.out.println(salariedEmployee.getSalary(2));
        HourlyEmployee hourlyEmployee = new HourlyEmployee("name",180,30,4);
        System.out.println(hourlyEmployee.getSalary(4));
        SalesEmployee salesEmployee = new SalesEmployee("name",30000,0.05,5);
        System.out.println(salesEmployee.getSalary(5));
    }
}
