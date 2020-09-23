package com.mashibing.dp.cor责任链模式.打折.priceFilterImpl;

import com.mashibing.dp.cor责任链模式.打折.PriceFilter;

/**
 * @author zhangning
 * @date 2020/9/23
 */
public class BOSS extends PriceFilter {
    @Override
    public void processDiscount(float discount) {

        if(discount>=3){
            System.out.println(this.getClass().getName()+"同意了->"+discount+"折");
        }else{
            System.out.println(this.getClass().getName()+"拒绝了<"+discount+">折");
        }
    }

}
