package com.wf.test;

public class Array {
    public static void main(String[] args) {
        /***
         * 冒泡排序
         * 比较相邻两数，交换位置，直到比较length-1次
         * 在第一趟排序中，比较length-1次，第二趟比较length-2次
         */
        /*int[] array={2,5,1,67,45,34,78,23,90,34,56,69};

           for(int i=0;i<array.length-1;i++){
            int flag=0;
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag++;
                }
            }
            if(flag==0){
                break;
            }
        }
        for(int a : array){
            System.out.println(a);
        }*/
        /**
         * 选择排序
         * 拿第一个数与后面所有的数进行比较，每一趟比较出最小的放在第一个
         * 第一趟比较length-1次，第二次比较length-2次。。。
         * 直到比较到length
         */
        /**for(int i =0;i<array.length-1;i++){
         for(int j=i+1;j<array.length;j++){
         if(array[i]>array[j]){
         int temp = array[j];
         array[j]=array[i];
         array[i]=temp;
         }
         }
         }
         for(int a : array){
         System.out.println(a);
         }*/
//        int[] array = new int[100000];
////        for (int i=0;i<array.length;i++){
////            array[i]=i+1;
////        }
////        int a=80000;
////        int index = search(array,a);
////        System.out.println(index);
////    }
        /**
         * 二分搜索查询
         */
//    public static int search(int[] array,int value){
//        int min = 0;
//        int max=array.length-1;
//        int mid;
//        int count = 0;
//        while(min<=max){
//            count++;
//            mid=(min+max)/2;
//            if(value==array[mid]){
//                System.out.println("查找了"+count+"次");
//            }
//            else if(value<array[mid]){
//                max=mid+1;
//            }
//            else{
//                min=mid-1;
//            }
//        }
//        return -1;
//
    }
}
