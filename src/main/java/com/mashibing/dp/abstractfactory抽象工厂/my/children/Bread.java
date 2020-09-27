package com.mashibing.dp.abstractfactory抽象工厂.my.children;

import com.mashibing.dp.abstractfactory抽象工厂.my.Father.Food;

/**
 * @author zhangning
 * @date 2020/9/22
 */
public class Bread extends Food {
    @Override
    public void printName() {
        System.out.println("我是面包");
    }
}
