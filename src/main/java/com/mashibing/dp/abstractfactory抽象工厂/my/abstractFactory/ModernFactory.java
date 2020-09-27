package com.mashibing.dp.abstractfactory抽象工厂.my.abstractFactory;

import com.mashibing.dp.abstractfactory抽象工厂.my.Father.Food;
import com.mashibing.dp.abstractfactory抽象工厂.my.Father.JiaoTongGongJu;
import com.mashibing.dp.abstractfactory抽象工厂.my.Father.Wuqi;
import com.mashibing.dp.abstractfactory抽象工厂.my.children.AK47;
import com.mashibing.dp.abstractfactory抽象工厂.my.children.Bread;
import com.mashibing.dp.abstractfactory抽象工厂.my.children.Car;

/**
 * @author zhangning
 * @date 2020/9/22
 */
public class ModernFactory  extends  AbstractFactory{
    @Override
    public Food createFood() {
        return new Bread();
    }

    @Override
    public  Wuqi createWuqi() {
        return new AK47();
    }

    @Override
    public JiaoTongGongJu createJiaoTongGongJu() {
        return new Car();
    }
}
