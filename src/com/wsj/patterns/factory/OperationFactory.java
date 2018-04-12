package com.wsj.patterns.factory;

/**
 * @autor JiJG
 * date: 2018/4/12
 */
public class OperationFactory {
    public static Operation createOperate(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            case "%":
                break;

        }

        return operation;
    }
}
