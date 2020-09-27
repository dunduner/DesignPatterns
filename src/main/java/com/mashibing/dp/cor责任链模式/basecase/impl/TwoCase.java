package com.mashibing.dp.cor责任链模式.basecase.impl;

import com.mashibing.dp.cor责任链模式.basecase.BaseCase;

/**
 * @author zhangning
 * @date 2020/9/23
 */
public class TwoCase implements BaseCase {
    @Override
    public void doSomeThing(String input, BaseCase baseCase) {
        if("2".equals(input)){
            System.out.println(getClass().getName());
            return;
        }
        baseCase.doSomeThing(input,baseCase);
    }
}
