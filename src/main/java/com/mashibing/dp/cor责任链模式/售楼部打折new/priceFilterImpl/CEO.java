package com.mashibing.dp.cor责任链模式.售楼部打折new.priceFilterImpl;

import com.mashibing.dp.cor责任链模式.售楼部打折new.PriceFilter;

/**
 *
 * CEO可以打五折以内的折扣
 * @author zhangning
 * @date 2020/9/23
 */
public class CEO implements PriceFilter {
    @Override
    public void processDiscount(float discount,PriceFilter priceFilter) {

        if(discount>=5){
            System.out.println(this.getClass().getName()+"同意了->"+discount+"折");
            return;
        }else{
            //priceFilter就是下一个责任链的责任人
            priceFilter.processDiscount(discount,priceFilter);
        }
    }

}
