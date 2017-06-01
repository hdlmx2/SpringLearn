package cn.hdlmx.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class ArithmetiCalculatorAspect {
    @Before("execution(public int cn.hdlmx.spring.aop.impl.ArithmetiCalculatorImpl.*(int,int ))")
    public void beforeMethod() {
        System.out.println("The method begins...");
    }
}
