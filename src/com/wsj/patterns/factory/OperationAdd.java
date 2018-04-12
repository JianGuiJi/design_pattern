package com.wsj.patterns.factory;

/**
 * @autor JiJG
 * date: 2018/4/12
 * 加法
 */
public class OperationAdd extends Operation {

    /**
     * 重写运算结果：加法运算
     *
     * @return
     */
    public double operateResult() {
        return super.getNumberA() + super.getNumberB();
    }
}
