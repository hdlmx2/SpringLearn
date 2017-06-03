package cn.hdlmx.srpingWithHibernate.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

import java.sql.SQLException;


public class SpringHibernateTest {

    private ApplicationContext ctx = null;

    {
        ctx = new ClassPathXmlApplicationContext("applicationContextHibernate.xml");
    }

    @Test
    public void testDataSource() throws SQLException {
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource.getConnection());
    }

}