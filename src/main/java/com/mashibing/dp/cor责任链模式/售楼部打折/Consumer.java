package com.mashibing.dp.cor责任链模式.售楼部打折;

/**
 * @author zhangning
 * @date 2020/9/23
 */
public class Consumer {

    private PriceFilter priceFilter;

    public void setPriceFilter(PriceFilter priceFilter) {
        this.priceFilter = priceFilter;
    }

    //请求折扣
    public void requstDiscount(float discount) {
        priceFilter.processDiscount(discount);
    }
}
