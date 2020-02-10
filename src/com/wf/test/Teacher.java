package com.wf.test;

public abstract class Teacher {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //抽象方法写在父类中，子类中必须重写父类的方法
    //父类也须加关键词abstract，定义为抽象类
    public abstract void teach();
    public int method(int a,int b){
        int c = a+b;
        return c;
    }
    public Teacher(int age,String name){

    }
    public Teacher(){

    }
}

