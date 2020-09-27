package com.mashibing.dp.abstractfactory抽象工厂.my.children;

import com.mashibing.dp.abstractfactory抽象工厂.my.Father.Wuqi;

/**
 * @author zhangning
 * @date 2020/9/22
 */
public class AK47 extends Wuqi {
    @Override
    public void shoot() {
        System.out.println("AK47 射击");
    }
}
