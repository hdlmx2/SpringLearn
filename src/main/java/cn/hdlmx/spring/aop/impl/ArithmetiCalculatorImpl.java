package cn.hdlmx.spring.aop.impl;

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
}
