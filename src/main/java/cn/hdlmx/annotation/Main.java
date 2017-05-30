package cn.hdlmx.annotation;

import cn.hdlmx.annotation.controller.UserController;
import cn.hdlmx.annotation.repository.UserRepository;
import cn.hdlmx.annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("annotation.xml");
        TestObject to = (TestObject) ctx.getBean("testObject");
        System.out.println(to);

        UserController userController = (UserController) ctx.getBean("userController");
        System.out.println(userController);

        UserRepository userRepository = (UserRepository) ctx.getBean("userRepository");
        System.out.println(userRepository);

        UserService userService = (UserService) ctx.getBean("userService");
        System.out.println(userService);
    }
}
