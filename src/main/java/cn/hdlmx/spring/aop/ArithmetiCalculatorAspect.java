package cn.hdlmx.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Order(1)
@Aspect
@Component

public class ArithmetiCalculatorAspect {
    @Before("execution(public int cn.hdlmx.spring.aop.impl.ArithmetiCalculatorImpl.*(int,int))")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] agrs = joinPoint.getArgs();
        List<Object> argsList = Arrays.asList(agrs);
        System.out.println("The method:" + methodName + " begins width:" + argsList);
    }
}
