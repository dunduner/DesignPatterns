package com.mashibing.dp.bridge.v5_my;


/**
 * @author zhangning
 * @date 2020/9/25
 */
public class GG_main {

    public void chase(MM mm) {
//        com.mashibing.dp.bridge.v4.Gift g = new WarmGift(new Flower());
//        give(mm, g);

//        CoolGift gift = new CoolGift(new Flower());
        WarmGift gift = new WarmGift(new Flower());
        give(mm, gift);
    }

    public void give(MM mm, Gift g) {
        System.out.println(mm.name + "收到了:" + g.giftType.giftType() + ",风格是:" + g.giftFengge);
    }

    public static void main(String[] args) {
        GG_main ggMain = new GG_main();
        ggMain.chase(new MM("凤姐"));
    }
}
