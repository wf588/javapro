package com.wf.test;

public class MyArray {
    //作为存储数据的数组
    private int[] array;
    //作为实际放入数据的个数
    private int size;
    public MyArray(){
        size = 0;
        array = new int[10];
    }
    public int getSize(){
        return array.length;
    }
    public void add(int i){
        //数组扩容
        if(size>=array.length){
            int[] newarray = new int[size+size/2];
            for (int k=0;k<array.length;k++){
                newarray[k]=array[k];
            }
            array = newarray;
            System.out.println("扩容完成，新数组长度为"+array.length);
        }
        array[size++]=i;

    }
    //通过下标取值
    public int get(int i){
        if (i<0||i>=size){
            System.out.println("索引错误");
            return -1;
        }
        return array[i];
    }
}
