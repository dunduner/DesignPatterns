package com.mashibing.dp.cor责任链模式.售楼部打折;

import com.mashibing.dp.cor责任链模式.售楼部打折.priceFilterImpl.*;

/**
 * @author zhangning
 * @date 2020/9/23
 */
public class PriceFilterFactory {
    public static  PriceFilter createPriceFilgerFactory() {
        PriceFilter sale = new Sale();
        PriceFilter manager = new Manager();
        PriceFilter leader = new Leader();
        PriceFilter ceo = new CEO();
        PriceFilter boss = new BOSS();

        sale.setPriceFilter(manager);
        manager.setPriceFilter(leader);
        leader.setPriceFilter(ceo);
        ceo.setPriceFilter(boss);
        return sale;
    }
}
