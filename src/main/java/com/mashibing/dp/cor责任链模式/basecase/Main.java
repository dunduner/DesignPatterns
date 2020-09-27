package com.mashibing.dp.cor责任链模式.basecase;

import com.mashibing.dp.cor责任链模式.basecase.impl.DefaultCase;
import com.mashibing.dp.cor责任链模式.basecase.impl.OneCase;
import com.mashibing.dp.cor责任链模式.basecase.impl.ThreeCase;
import com.mashibing.dp.cor责任链模式.basecase.impl.TwoCase;

/**
 * @author zhangning
 * @date 2020/9/23
 */
public class Main {
    public static void main(String[] args) {
        BaseCaseChain baseCaseChain = new BaseCaseChain();


        baseCaseChain.addCase(new OneCase())
                .addCase(new TwoCase())
                .addCase(new ThreeCase())
                .addCase(new DefaultCase());

        baseCaseChain.doSomeThing("3", baseCaseChain);

    }
}
