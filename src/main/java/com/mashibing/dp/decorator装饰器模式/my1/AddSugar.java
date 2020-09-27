package com.mashibing.dp.decorator装饰器模式.my1;

/**
 * @author zhangning
 * @date 2020/9/27
 */
public class AddSugar extends DecoratorCoofe {


    public AddSugar(Coofe coofe) {
        super(coofe);
    }


    @Override
    public double getPrice() {
        double add = 0.1;
        return super.getPrice()+0.1;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+"，白砂糖";
    }
}
