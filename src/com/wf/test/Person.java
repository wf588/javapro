package com.wf.test;

public class Person extends Animal{
    /*private int age;
    private int no;
    public Person(){    //无参构造

    }
    //构造方法
    public Person(int age,int no){
        this.age=age;
        this.no=no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
   /* public int add(int a,int b){
        int c=a+b;
        return c;
    }*/

    public static int add(int a,int b){
        int c=a+b;
        return c;
    }
    public int add(int a,int b,int c){
        int d=a+b+c;
        return d;
    }
    //方法重写
    @Override
    public void run() {
        System.out.println("人在大步的向前跳");
    }
}
