package cn.hdlmx.spring.aop.impl;

import cn.hdlmx.spring.aop.ArithmetiCalculator;
import org.springframework.stereotype.Component;

@Component(value = "arithmetiCalculator")
public class ArithmetiCalculatorImpl implements ArithmetiCalculator {

    public int add(int x, int y) {
        return x + y;
    }

    public int sub(int x, int y) {
        return x - y;
    }

    public int mul(int x, int y) {

        return x * y;
    }

    public int div(int x, int y) {

        return x / y;
    }
    public int test(){
        return 0;
    }
}
