package com.mashibing.dp.cor责任链模式.售楼部打折new;

import java.util.ArrayList;

/**
 * @author zhangning
 * @date 2020/9/23
 */
public class PriceFilterChain implements PriceFilter {
    private ArrayList<PriceFilter> lists = new ArrayList<>();
    private int index = 0;
    public PriceFilterChain add(PriceFilter priceFilter){
        lists.add(priceFilter);
        return this;
    }
    @Override
    public void processDiscount(float discount, PriceFilter priceFilterChain) {
        if (index == lists.size()) {
            return;
        }
        PriceFilter priceFilterNext = lists.get(index);
        index++;
        //priceFilterNext调用自己的方法,并将要遍历的priceFilterchainFilter传回去
        priceFilterNext.processDiscount(discount, priceFilterChain);

    }
}
