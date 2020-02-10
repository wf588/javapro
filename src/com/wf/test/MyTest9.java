package com.wf.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class MyTest9 {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        Date startarray = new Date();
        for(int i=0;i<100000;i++){        //计算ArrayList中间添加用时
            arrayList.add(i);
        }
        Date endarray = new Date();
        System.out.println("ArrayList添加用时="+(endarray.getTime()-startarray.getTime()));
        Date startlist = new Date();
        for(int i=0;i<100000;i++){          //计算LinkedList中间添加用时
            linkedList.add(i);
        }
        Date endlist = new Date();
        System.out.println("LinkedList添加用时="+(endlist.getTime()-startlist.getTime()));
        Date startreadarray = new Date();
        for(int i=0;i<arrayList.size();i++){   //比较arrayList的读取时间和
            Object obj = arrayList.get(i);     // linkedList的读取时间
        }
        Date endreadarray = new Date();
        System.out.println("arrayList的读取时间="+(endreadarray.getTime()-startreadarray.getTime()));
        Date startreadlist = new Date();
        for(int i=0;i<linkedList.size();i++){
            Object obj = linkedList.get(i);
        }
        Date endreadlist = new Date();
        System.out.println("linkedList的读取时间="+(endreadlist.getTime()-startreadlist.getTime()));
    }
}
