package com.mashibing.dp.cor责任链模式.售楼部打折new.priceFilterImpl;

import com.mashibing.dp.cor责任链模式.售楼部打折new.PriceFilter;

/**
 *
 * 销售员，可以批准95折以内的折扣
 * @author zhangning
 * @date 2020/9/23
 */
public class Sale implements PriceFilter {

    @Override
    public void processDiscount(float discount,PriceFilter priceFilter) {
        System.out.println(discount);
        if(discount>=9.5){
            System.out.println(this.getClass().getName()+"同意了->"+discount+"折");
            return;
        }else{
            //priceFilter就是下一个责任链的责任人
            priceFilter.processDiscount(discount,priceFilter);
        }
    }

}
