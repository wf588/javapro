package com.wf.test;

public class MyTest13 {
    public static void main(String[] args) {
       Runnable myThread2 = (Runnable) new MyThread2();
       Thread t1 = new Thread(myThread2);
        Thread t2 = new Thread(myThread2);
       t1.start();
       t2.start();
    }
}
