package com.wf.test;

public class MyThread2 {
    private int count = 80;
    public void run(){
        while (count>0){
            System.out.println(Thread.currentThread().getName()+"卖出了第"+count+"张票");
            count--;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
