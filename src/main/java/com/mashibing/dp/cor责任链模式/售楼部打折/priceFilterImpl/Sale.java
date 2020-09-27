package com.mashibing.dp.cor责任链模式.售楼部打折.priceFilterImpl;

import com.mashibing.dp.cor责任链模式.售楼部打折.PriceFilter;

/**
 *
 * 销售员，可以批准5%以内的折扣
 * @author zhangning
 * @date 2020/9/23
 */
public class Sale extends PriceFilter {

    @Override
    public void processDiscount(float discount) {
        //可以打5%折的折扣
        if(discount>=9.5){
            System.out.println(this.getClass().getName()+"同意了->"+discount+"折");
        }else{
            //没有权利  找经理
            this.successor.processDiscount(discount);
        }
    }

}
