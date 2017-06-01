package cn.hdlmx.spring.aop.impl;

import cn.hdlmx.spring.aop.ArithmetiCalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applictaionContext.xml");
        ArithmetiCalculator arithmetiCalculator= (ArithmetiCalculator) ctx.getBean("arithmetiCalculator");
        int result=arithmetiCalculator.add(1,2);
        System.out.println("result:"+result);

    }
}
