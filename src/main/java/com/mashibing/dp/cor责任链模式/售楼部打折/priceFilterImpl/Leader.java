package com.mashibing.dp.cor责任链模式.售楼部打折.priceFilterImpl;

import com.mashibing.dp.cor责任链模式.售楼部打折.PriceFilter;

/**
 *
 * 部门老大，可以批准30%以内的折扣
 * @author zhangning
 * @date 2020/9/23
 */
public class Leader extends PriceFilter {

    @Override
    public void processDiscount(float discount) {
        if(discount>=7){
            System.out.println(this.getClass().getName()+"同意了->"+discount+"折");
        }else{
            //没有权利  找leader
            this.successor.processDiscount(discount);
        }
    }

}
