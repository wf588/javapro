package com.wf.test;

public class Dog {
    private int age;
    private char sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age>0&&age<20){
            this.age = age;
        }else {
            System.out.println("年龄范围输入有误");
        }
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {

        if (sex=='公'||sex=='母'){
            this.sex = sex;
        }else {
            System.out.println("输入错误，性别只能是公或母");
        }
    }
}
