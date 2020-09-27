package com.mashibing.dp.cor责任链模式.售楼部打折new;

import com.mashibing.dp.cor责任链模式.售楼部打折.PriceFilterFactory;
import com.mashibing.dp.cor责任链模式.售楼部打折new.priceFilterImpl.*;

/**
 * @author zhangning
 * @date 2020/9/23
 */
public class Main {
    public static void main(String[] args) {

        PriceFilterChain priceFilterChain = new PriceFilterChain();
        priceFilterChain.add(new Sale())
                .add(new Manager())
                .add(new Leader())
                .add(new CEO())
                .add(new BOSS());

        priceFilterChain.processDiscount(3.5f,priceFilterChain);
    }
}
