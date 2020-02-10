package com.wf.test;

import java.util.ArrayList;
import java.util.List;

public class MyTest7 {
    public static void main(String[] args) {
      /*I3 i3 = new I3();
      I5 i5 = new I5();
      I7 i7 = new I7();
      MainBoard mainBoard = new MainBoard();
      mainBoard.setCpu(i3);
      mainBoard.method();*/

      /*MyArray myArray = new MyArray();
      myArray.add("djfl");
      myArray.add("23123");
      for(int i=0;i<myArray.getSize();i++){
          System.out.println(myArray.get(i));
      }*/
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(51);
        list.add(0,100);
        List list2 = new ArrayList();
        list2.add("jdfks");
        list2.add("sss");


        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(list.addAll(list2));
    }
}

