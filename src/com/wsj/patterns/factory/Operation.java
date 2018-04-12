package com.wsj.patterns.factory;

/**
 * @autor JiJG
 * date: 2018/4/12
 * 简单工厂模式--代码无错就是优？
 */
public class Operation {
    private double numberA;
    private double numberB;
    private double result;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getResult() {
        result = 0;
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double operateResult() {
        return result;
    }
}
