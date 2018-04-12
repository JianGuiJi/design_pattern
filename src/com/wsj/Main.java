package com.wsj;

import com.wsj.patterns.factory.Operation;
import com.wsj.patterns.factory.OperationFactory;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //简单工厂模式--运算类
        Operation operation;
        operation = OperationFactory.createOperate("/");
        operation.setNumberA(100);
        operation.setNumberB(0);
        double result = operation.operateResult();
        System.out.println(result);
        /**
         * 在浮点数运算时，有时我们会遇到除数为0的情况，那java是如何解决的呢？

         我们知道，在整型运算中，除数是不能为0的，否则直接运行异常。但是在浮点数运算中，引入了无限这个概念，我们来看一下Double和Float中的定义。
         https://www.cnblogs.com/zhisuoyu/archive/2016/03/24/5314541.html
         */


    }
}
