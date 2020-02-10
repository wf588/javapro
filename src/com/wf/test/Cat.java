package com.wf.test;

public class Cat extends Animal {
    private String color;
    private String sex;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    //方法重写
    @Override
    public void run() {
        System.out.println("猫是用四脚在跑");
    }
}
