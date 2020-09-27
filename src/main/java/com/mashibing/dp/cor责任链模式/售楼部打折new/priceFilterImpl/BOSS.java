package com.mashibing.dp.cor责任链模式.售楼部打折new.priceFilterImpl;

import com.mashibing.dp.cor责任链模式.售楼部打折new.PriceFilter;

/**
 * @author zhangning
 * @date 2020/9/23
 */
public class BOSS implements PriceFilter {
    @Override
    public void processDiscount(float discount,PriceFilter priceFilter) {
        if(discount>=3){
            System.out.println(this.getClass().getName()+"同意了->"+discount+"折");
            return;
        }else{
            System.out.println(this.getClass().getName()+"拒绝了<"+discount+">折");
        }
    }

}
