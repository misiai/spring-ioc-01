package com.misiai.test;

import com.misiai.bean.Student;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;


/*测试bean自动装配*/
public class Test06 {
    ConfigurableApplicationContext ap = new ClassPathXmlApplicationContext("spring-ioc-6.xml");

    @Test
    public void test03() {
        Student student03 = ap.getBean("student03", Student.class);
        System.out.println(student03.getSno());
    }
    /**

    @Test
    public void test02() {
        Student student02 = ap.getBean("student02", Student.class);
        System.out.println(student02);
    }
    /**
     * 测试bean自动装配
     */
    @Test
    public void test01() throws SQLException {
        Student student = ap.getBean(Student.class);
        System.out.println(student.getCar());

    }
}
