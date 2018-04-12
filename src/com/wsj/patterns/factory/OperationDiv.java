package com.wsj.patterns.factory;

/**
 * @autor JiJG
 * date: 2018/4/12
 */
public class OperationDiv extends Operation {
    /**
     * 重写运算结果：除法运算
     *
     * @return
     */
    public double operateResult() {

        return super.getNumberA() / super.getNumberB();

    }
}
