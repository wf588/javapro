package com.wf.test;

public class MyTest3 {
    public static void main(String[] args) {
        /***
         * 从1-4这四个数中，拿出三个数，能组成多少组数字
         * 1-100 之间的偶数和
         * 定义两个int变量m和n，计算m的n次方
         * 100-999之间的水仙花数，例如：153 1^3+5^3+3^3=153
         * 两个正整数 计算最大公约数和最小公倍数
         */
        /**
         * 从1-4这四个数中，拿出三个数，能组成多少组数字
         */
       /*int[] array={1,2,3,4};
        for(int a :array){
            int x= a*100;
            for (int b :array){
                if (a!=b){
                    int y =x+b*10;
                    for (int c:array){
                        if (c!=a&&c!=b){
                            int z=y+c;
                            System.out.println(z);
                        }
                    }
                }

            }
        }*/
        /**
         *  1-100 之间的偶数和
         */
        /*int sum= 0;
        int a=0;
        for (int i=1;i<=100;i++){
            if (i%2==0){
                a = i;
            }else{
                 a=0;
            }
            sum=sum+a;
        }
        System.out.println(sum);*/
        /**
         * 定义两个int变量m和n，计算m的n次方
         */
        /*int m=5;
        int n=3;
        int a=1;
        for(int i=1;i<=n;i++){
           a*=m;
        }
        System.out.println(a);*/
        /**
         * 100-999之间的水仙花数，例如：153 1^3+5^3+3^3=153
         */
        /*for(int i=100;i<=999;i++){
            //取百位
            int a=i/100;
            // 取十位
            int b=i/10%10;
            // 取个位
            int c = i%10;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }*/

        /**
         * 两个正整数 计算最大公约数和最小公倍数
         */
        /*int a =90;
        int b =65;
        int m=1;
        int n=1;
        for (int i=1;i<=a;i++){
            if(a%i==0){
              m=i;
            }
            for (int j=1;j<=b;j++){
                if(b%j==0){
                    n=j;
                }
            }
            if(m==n){
                System.out.println(n);
            }
        }*/
        /*int x=10;
        int y=15;
        int max=1;
        int min=max(x,y);
        for(int i=1;i<=x&&i<=y;i++){
            if(x%i==0&&y%i==0){
                max=i;
            }
        }
        for(int i=min;i<=x*y;i++){
            if(i%x==0&&i%y==0){
                min=i;
                break;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }*/
    }
}

