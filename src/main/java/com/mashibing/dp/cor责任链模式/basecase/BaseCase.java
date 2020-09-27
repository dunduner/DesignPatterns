package com.mashibing.dp.cor责任链模式.basecase;

/**
 * @author zhangning
 * @date 2020/9/23
 */
public interface BaseCase {


    void doSomeThing(String input,BaseCase baseCase);

}
