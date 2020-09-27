package com.mashibing.dp.abstractfactory抽象工厂.my.abstractFactory;

import com.mashibing.dp.abstractfactory抽象工厂.my.Father.Food;
import com.mashibing.dp.abstractfactory抽象工厂.my.Father.JiaoTongGongJu;
import com.mashibing.dp.abstractfactory抽象工厂.my.Father.Wuqi;

/**
 * @author zhangning
 * @date 2020/9/22
 */
public abstract class AbstractFactory {
    public abstract Food createFood();
    public abstract Wuqi createWuqi();
    public abstract JiaoTongGongJu createJiaoTongGongJu();
}
