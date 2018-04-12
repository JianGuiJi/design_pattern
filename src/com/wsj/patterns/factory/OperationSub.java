package com.wsj.patterns.factory;

/**
 * @autor JiJG
 * date: 2018/4/12
 * 减法
 */
public class OperationSub extends Operation {
    /**
     * 重写运算结果：减法运算
     *
     * @return
     */
    public double operateResult() {

        double result = super.getNumberA() - super.getNumberB();
        return result;
    }
}
