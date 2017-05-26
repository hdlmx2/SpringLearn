package cn.hdlmx.bean;

import cn.hdlmx.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        Address address= (Address) ctx.getBean("address");
        System.out.println(address);

        UserController userController= (UserController) ctx.getBean("userController");
        System.out.println(userController);
    }
}
