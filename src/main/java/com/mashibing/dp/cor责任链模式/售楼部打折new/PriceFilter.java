package com.mashibing.dp.cor责任链模式.售楼部打折new;

/**
 * @author zhangning
 * @date 2020/9/23
 */
public interface PriceFilter {

    //处理折扣的申请
    void processDiscount(float discount, PriceFilter priceFilter);
}
