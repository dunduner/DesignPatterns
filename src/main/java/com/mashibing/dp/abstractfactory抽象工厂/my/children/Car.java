package com.mashibing.dp.abstractfactory抽象工厂.my.children;

import com.mashibing.dp.abstractfactory抽象工厂.my.Father.JiaoTongGongJu;

/**
 * @author zhangning
 * @date 2020/9/22
 */
public class Car extends JiaoTongGongJu {
    @Override
    public void go() {

        System.out.println("car gogogogo!");
    }
}
