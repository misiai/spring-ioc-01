package com.misiai.test;

import com.misiai.bean.Book;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;


/*测试bean生命周期，以及一些处理器*/
public class Test05 {
    ConfigurableApplicationContext ap = new ClassPathXmlApplicationContext("spring-ioc-5.xml");

    /**
     * 测试数据库
     */
    @Test
    public void test01() throws SQLException {
        // 1、从容器中拿到连接池
        DataSource dataSource = ap.getBean("dataSource", DataSource.class);
        System.out.println(dataSource);

    }
}
