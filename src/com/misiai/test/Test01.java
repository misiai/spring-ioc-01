package com.misiai.test;

import com.misiai.bean.Score;
import com.misiai.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    ApplicationContext ap = new ClassPathXmlApplicationContext("spring-ioc.xml");

    /**
     * 测试p命名空间
     */
    @Test
    public void test04() {
        Student student04 = ap.getBean("student04", Student.class);
        System.out.println("student04 = " + student04);
    }


    /**
     * 通过有参构造器
     */
    @Test
    public void test03() {
        Student student03 = ap.getBean("student03", Student.class);
        System.out.println("student03 = " + student03);
    }

    /**
     * 通过bean的类型，从IOC容器中找到bean的实例！
     */
    @Test
    public void test02() {
        // Student bean = ap.getBean(Student.class);
        // System.out.println("bean = " + bean);
        // 传入ID时，同时参数类型
        Student student02 = ap.getBean("student02", Student.class);
        System.out.println("student02 = " + student02);
    }

    /**
     * Spring的基础测试
     */
    @Test
    public void test01() {
        /*该类是属于：org.springframework.context包下的，代表IOC容器，*/
        // ApplicationContext ap = new ClassPathXmlApplicationContext("spring-ioc.xml");
        /*spring-iox.xml是我们之前编写的配置文件*/
        // System.out.println("在getBean之前输出这句话");
        // Student st1 = (Student) ap.getBean("student01");
        // Student st2 = (Student) ap.getBean("student01");
        // System.out.println(st1 == st2);
        /*student01是我们之前bean下定义的id*/
        // System.out.println("在student01.getName之前输出这句话");
        // System.out.println(student01.getName());
        // System.out.println(student01);
        Object student03 = ap.getBean("student03");
    }


}
