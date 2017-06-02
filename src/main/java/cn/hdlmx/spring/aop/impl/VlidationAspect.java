package cn.hdlmx.spring.aop.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Order(2)
@Aspect
@Component
public class VlidationAspect {
    @Before("execution(public int cn.hdlmx.spring.aop.impl.ArithmetiCalculatorImpl.*(int,int))")
    public void vlidateArgs(JoinPoint joinPoint){
        System.out.println("-->validate:"+ Arrays.asList(joinPoint.getArgs()));
    }
}
