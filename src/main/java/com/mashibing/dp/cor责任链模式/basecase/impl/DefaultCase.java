package com.mashibing.dp.cor责任链模式.basecase.impl;

import com.mashibing.dp.cor责任链模式.basecase.BaseCase;

/**
 * @author zhangning
 * @date 2020/9/23
 */
public class DefaultCase implements BaseCase {
    @Override
    public void doSomeThing(String input, BaseCase baseCase) {
        System.out.println(getClass().getName());
        System.out.println("input:"+input+"->没人处理");
        return;
    }
}
