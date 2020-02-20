package com.wf.test1;

import com.wf.pojo.Dept;
import com.wf.pojo.Emp;
import com.wf.pojo.Student;
import com.wf.util.JdbcUtil;
import com.wf.util.MyArray;
import com.wf.util.RowMap;
import com.wf.web.StudentWeb;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyTest2 {
    public static void main(String[] args) {
        /*StudentWeb studentWeb = new StudentWeb();
        studentWeb.showmain();
        studentWeb.input();*/
      /*  Student student = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();*/
        /**
         *  类在第一次主动使用的时候   会把class加载到 我们内存的方法区中
         *  并且在堆区中会创建一个 Class类型的对象  指向到该方法区
         *  反射 就是 我们要获取 那个Class类型的对象
         *  获取该对象的方法
         *      1 类名.class   Class clz = Student.class;
         *      2 对象名.getClass()
         *          Student student = new Student();
         Class clz2 = student.getClass();
         *      3 Class.forName("类的完全限定名")
         *          Class clz3 = Class.forName("com.neuedu.pojo.Student");
         * */
        Class clz = Dept.class;
        // 调用 该类的无参构造创建一个对象
        // 类下 每一个方法都会封装成 Method类型的对象
        // 类下 每一个属性都会封装成 Field类型的对象
        // 有多少个属性 就有多少个 Field  有多少个方法 就有多少个 Method
        // 实际上  Field是个数组  Method也是数组
       /* Field[] fields = clz.getDeclaredFields();
        for (Field  f : fields){
            System.out.println(f.getName());
        }*/
        /**
         *  注解 ：
         *   在反射过程中
         *   为了让 类 属性 方法 等实现某些特定功能 而诞生的
         *   写法 @注解名(注解值) 注解值 可以有一个或者多个
         *   如何定义一个注解  其实 注解就是 @接口
         *
         * */
       /*List<Student> list = JdbcUtil.executeQuery("select id,name,age,gender from student", (rs) -> {
           Student student = new Student();
           try {
               student.setId(rs.getInt("id"));
               student.setName(rs.getString("name"));
               student.setAge(rs.getInt("age"));
               student.setGender(rs.getInt("gender"));
           } catch (SQLException e) {
               e.printStackTrace();
           }
           return student;
       });
        System.out.println(list);*/
        /**
         *  增删改的时候 先在java中 把list对象改变了
         *   增删改的时候 是先该内存中的数据
         *  再序列化 保存到硬盘中
         *   提交的时候 将内存数据写入到硬盘中
         *   数据的默认机制  是 增删改之后 马上就会自动提交
         *
         *  事务是 进行一个或者多个增删改
         *   如果全部都可以的话 那么改过之后 一起提交 写入数据库硬盘
         *   如果有一个失败了  那么成功的部分也会退回到 成功之前的状态(回滚)
         *
         *   例如   兰哥 给我  转了1000元
         *       相当于 在兰哥的银行账款中 减少1000元
         *              在我的银行账款中  增加1000元
         *        假如 没有事务  兰哥 减少1000元  宕机了 我的没加上
         *
         *  在mysql 中  如果要实现事务 就必须要把 数据库 引擎 改为 InnoDB
         *  如果 引擎不是 InnoDB 那么该数据库是不支持事务
         *
         *   事务特性
         *       1 原子性
         *       2 一致性
         *       3 隔离性
         *       4 持久性
         *
         * */
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(()->{
            shiwu1();
        });
        service.execute(()->{
            shiwu2();
        });
        service.shutdown();
    }



    public static void shiwu1(){
        Connection con = JdbcUtil.getConnection();
        PreparedStatement pstmt = null;
        // 如果实现事务管理  我们就必须 不能让 每次增删改之后都自动提交
        try {
            con.setAutoCommit(false);
            Thread.sleep(1000);
            pstmt = con.prepareStatement("insert into student(id,name,age,gender) values(?,?,?,?)");
            pstmt.setInt(1,1);
            pstmt.setString(2,"张三");
            pstmt.setInt(3,20);
            pstmt.setInt(4,1);
            Thread.sleep(1000);
            int i = pstmt.executeUpdate();
            System.out.println("事务1执行--"+i);

            con.commit();


        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                if(pstmt != null)
                    pstmt.close();
                if(con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void shiwu2(){

        Connection con = JdbcUtil.getConnection();
        PreparedStatement pstmt = null;
        PreparedStatement pstmt2 = null;
        ResultSet rs = null;
        // 如果实现事务管理  我们就必须 不能让 每次增删改之后都自动提交
        try {
            con.setAutoCommit(false);
            con.setTransactionIsolation(8);
            pstmt = con.prepareStatement("select id,name,age,gender from student where id=1");
            rs = pstmt.executeQuery();
            if(rs.next()){
                System.out.println("事务2===存在 不能写了 ");
            }else{
                System.out.println("事务2====可以写 ");
                Thread.sleep(3000);
                pstmt2 = con.prepareStatement("insert into student(id,name,age,gender) values(?,?,?,?)");
                pstmt2.setInt(1,1);
                pstmt2.setString(2,"张三");
                pstmt2.setInt(3,20);
                pstmt2.setInt(4,1);
                int i = pstmt2.executeUpdate();
                System.out.println("事务2==="+i);
            }
            con.commit();
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                if(rs != null)
                    rs.close();
                if(pstmt != null)
                    pstmt.close();
                if(pstmt2 != null)
                    pstmt2.close();
                if(con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
