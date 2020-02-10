package com.wf.test;

public class MyTest8 {
    public static void main(String[] args) {
       /* int[] array = new int[6];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;
        array[5]=6;
        int[] array2 = new int[10];
        array2[0]=array[0];
        array2[6]=7;
        */
        MyArray myArray= new MyArray();
        for (int i=1;i<=20;i++){
            myArray.add(i);
        }
        for (int i=0;i<myArray.getSize();i++){
            System.out.println(myArray.get(i));

        }
    }
}
