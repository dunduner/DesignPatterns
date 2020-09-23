package com.mashibing.dp.cor责任链模式.打折;

/**
 * @author zhangning
 * @date 2020/9/23
 */
public abstract class PriceFilter {
    //直接后继，用于传递请求
    public PriceFilter successor;

    //设置后继者
    public void setPriceFilter(PriceFilter successor) {
        this.successor = successor;
    }

    //处理折扣的申请
    public abstract void processDiscount(float discount);
}
