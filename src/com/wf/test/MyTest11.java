package com.wf.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MyTest11 {
    public static void main(String[] args) {
       /* int a = 10;
        Student student = new Student();
        student.setId(10);
        student.setName("张三");
        student.setAge(18);
        student.setGrade("卓越1班");*/

       /*createNewFile() 创建文件 返回boolean 如果文件不存在 则可以创建  如果文件已经存在不会再创建
         mkdir() 创建目录  只创建目录的最后一级 必须保证前面的父目录是存在
         mkdirs() 创建目录  创建目录 无论是任何一级 不存在就会创建
         delete() 删除文件
         isDirectory() 是否是目录
         isFile() 是否是文件
         字节输出流 OutputStream
         字节输入流 InputStream
         字符输入流 Reader  BufferedReader
         字符输出流 Writer
        */
        File file = new File("d:\\Test.java");
       /* System.out.println(file.getName());  获取文件的文件名
        System.out.println(file.length());    获取文件大小(字节)
        System.out.println(file.exists());    查看文件是否存在
        System.out.println(file.getPath());   获取文件路径
        System.out.println(file.isDirectory());*/
       /* try {
            OutputStream outputStream = new FileOutputStream(file,true);
            String a = "\n11111111111";
            outputStream.write(a.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        /*InputStream inputStream = null;
        try {
             inputStream = new FileInputStream(file);
            byte[] a = new byte[10];
            int b = inputStream.read(a);
            while(b!= -1){
                System.out.println("读取字节数:"+b);
                System.out.println(new String(a,0,b));
                b = inputStream.read(a);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(inputStream != null){
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

       /* Reader reader = null;
        BufferedReader br = null;
        try {
            reader = new FileReader(file);
            br = new BufferedReader(reader);
            String str = br.readLine();
            while(str!=null){
                System.out.println(str);
                str = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(br!=null){
                    br.close();
                }
                if(reader!=null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        Writer writer = null;
        try {
            writer = new FileWriter(file,true);
            writer.write("11111111");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(writer!=null){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
