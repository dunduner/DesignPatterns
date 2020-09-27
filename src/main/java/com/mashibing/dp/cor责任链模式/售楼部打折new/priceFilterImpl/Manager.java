package com.mashibing.dp.cor责任链模式.售楼部打折new.priceFilterImpl;

import com.mashibing.dp.cor责任链模式.售楼部打折new.PriceFilter;

/**
 *
 * 经理，可以批准20%以内的折扣
 * @author zhangning
 * @date 2020/9/23
 */
public class Manager implements PriceFilter {

    @Override
    public void processDiscount(float discount,PriceFilter priceFilter) {
        //可以打5%折的折扣
        if(discount>=8){
            System.out.println(this.getClass().getName()+"同意了->"+discount+"折");
            return;
        }else{
            //priceFilter就是下一个责任链的责任人
            priceFilter.processDiscount(discount,priceFilter);
        }
    }

}
