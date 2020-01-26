package com.misiai.test;

import com.misiai.bean.Car;
import com.misiai.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*测试bean中，为各种类型赋值*/
public class Test02 {
    ApplicationContext ap = new ClassPathXmlApplicationContext("spring-ioc-2.xml");

    @Test
    public void test05() {
        Student student05 = ap.getBean("student05", Student.class);
        Student student06 = ap.getBean("student06", Student.class);
        System.out.println(student05);
        System.out.println("student06 = " + student06);
    }

    @Test
    public void test04() {
        Student student04 = ap.getBean("student04", Student.class);
        Car car = ap.getBean("car", Car.class);
        System.out.println(car.getPrice());
        System.out.println(student04.getCar());
    }
    @Test
    public void test03() {
        Student student03 = ap.getBean("student03", Student.class);
        System.out.println(student03.getMap());
    }

    @Test
    public void test02() {
        Student student02 = ap.getBean("student02", Student.class);
        // System.out.println(student02.getMap());
        System.out.println(student02.getProperties());
    }
    @Test
    public void test01() {
        Student student01 = (Student) ap.getBean("student01");
        // System.out.println("student01 = " + student01);
        // System.out.println(student01.getName() == null);
        System.out.println(student01.getCar());

    }
}
