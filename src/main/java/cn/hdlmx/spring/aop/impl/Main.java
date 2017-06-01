package cn.hdlmx.spring.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applictaionContext.xml");
        ArithmetiCalculatorImpl arithmetiCalculator= (ArithmetiCalculatorImpl) ctx.getBean("arithmetiCalculatorImpl");
        int result=arithmetiCalculator.add(1,2);
        System.out.println("result:"+result);

    }
}
