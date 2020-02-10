package com.wf.test;

public class MyTest1 {
    public static void main(String[] args) {


    /*int sum=0;
    for(int i=1;i<=100;i++){
        sum= sum+i;

    } System.out.println(sum);*/
        /**
         * 计算1-100的质数和
         * 质数是只能被自己和1整除
         * 1不是质数，2是质数
         */

       /* Person p1= new Person();
        int c = p1.add(1,2);
        System.out.println(c);
        int m= p1.add(1,2,3);
        System.out.println(m);*/
       /* int c =Person.add(1,2);
        System.out.println(c);*/

       /* int a = 10;
        method(a);
        System.out.println(a);*/
        Person a = new Person();
        a.setAge(10);
        method(a);
        System.out.println(a.getAge());

    }
    public static void method(int a){
        a =100;
    }
    public static void method(Person a){
        a.setAge(100);
    }
}
