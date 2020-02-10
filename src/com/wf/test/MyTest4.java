package com.wf.test;

public class MyTest4 {
    public static void main(String[] args) {
        //通过无参构造创造对象
//        Person p1 = new Person();
//        System.out.println(p1.getAge());
        //通过另外一个有参的构造创建对象
//        Person p2 = new Person(1,3);
//        System.out.println(p2.getAge());
        Cat c1= new Cat();
        c1.setAge(1);
        c1.setName("小白");
        c1.setColor("白色");
        c1.run();
        System.out.println(c1.getAge());
        System.out.println(c1.getName());
        System.out.println(c1.getColor());
        Person p1 = new Person();
        p1.run();

    }
}
