package com.mashibing.dp.abstractfactory抽象工厂.my;

import com.mashibing.dp.abstractfactory抽象工厂.my.Father.Food;
import com.mashibing.dp.abstractfactory抽象工厂.my.Father.JiaoTongGongJu;
import com.mashibing.dp.abstractfactory抽象工厂.my.Father.Wuqi;
import com.mashibing.dp.abstractfactory抽象工厂.my.abstractFactory.AbstractFactory;
import com.mashibing.dp.abstractfactory抽象工厂.my.abstractFactory.ModernFactory;

/**
 * @author zhangning
 * @date 2020/9/22
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory abs = new ModernFactory();
        Food food = abs.createFood();
        food.printName();
        JiaoTongGongJu jiaoTongGongJu = abs.createJiaoTongGongJu();
        jiaoTongGongJu.go();
        Wuqi wuqi = abs.createWuqi();
        wuqi.shoot();

    }
}
