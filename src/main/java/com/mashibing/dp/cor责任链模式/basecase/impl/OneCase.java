package com.mashibing.dp.cor责任链模式.basecase.impl;

import com.mashibing.dp.cor责任链模式.basecase.BaseCase;

/**
 * @author zhangning
 * @date 2020/9/23
 */
public class OneCase implements BaseCase {
    @Override
    public void doSomeThing(String input, BaseCase baseCase) {
        if("1".equals(input)){
            System.out.println(getClass().getName());
            return;
        }
        baseCase.doSomeThing(input,baseCase);
    }
}
