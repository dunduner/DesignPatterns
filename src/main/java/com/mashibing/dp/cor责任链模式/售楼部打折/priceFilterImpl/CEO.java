package com.mashibing.dp.cor责任链模式.打折.priceFilterImpl;

import com.mashibing.dp.cor责任链模式.打折.PriceFilter;

/**
 *
 * CEO可以打五折以内的折扣
 * @author zhangning
 * @date 2020/9/23
 */
public class CEO extends PriceFilter {
    @Override
    public void processDiscount(float discount) {

        if(discount>=5){
            System.out.println(this.getClass().getName()+"同意了->"+discount+"折");
        }else{
            //没有权利  找boss
            this.successor.processDiscount(discount);
        }
    }

}
