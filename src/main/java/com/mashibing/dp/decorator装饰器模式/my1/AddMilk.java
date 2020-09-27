package com.mashibing.dp.decorator装饰器模式.my1;

/**
 * @author zhangning
 * @date 2020/9/27
 */
public class AddMilk extends DecoratorCoofe {


    public AddMilk(Coofe coofe) {
        super(coofe);
    }


    @Override
    public double getPrice() {
        double add = 0.5;
        return super.getPrice()+0.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+"，牛奶";
    }
}
