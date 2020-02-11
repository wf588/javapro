package com.wf.test;

public class MyTest10 {
    public static void main(String[] args) {
        /*int[][] array = new int[][]{{1,2,3},{4,5,6},{7,8,9,10},{11,12,13,14,15,16}};  //数组里有4个元素
        System.out.println(array[0][2]);*/

        //switch case不能判断<、>则只能判断等于
        int i=2;
        switch(i){
            case 1:
            System.out.println("周一");
            break;
            case 2:
                System.out.println("周二");
                break;
            default:
                System.out.println("周五");
        }
    }
}
