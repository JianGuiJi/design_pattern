package com.wsj.patterns.factory;

/**
 * @autor JiJG
 * date: 2018/4/12
 */
public class OperationMul extends Operation {
    /**
     * 重写运算结果：乘法运算
     *
     * @return
     */
    public double operateResult() {
        return super.getNumberA() * super.getNumberB();
    }
}
