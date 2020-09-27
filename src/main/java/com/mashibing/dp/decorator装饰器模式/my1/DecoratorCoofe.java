package com.mashibing.dp.decorator装饰器模式.my1;

/**
 * @author zhangning
 * @date 2020/9/27
 */
public abstract class DecoratorCoofe implements Coofe {

    public Coofe decoratorCoofe;

    public DecoratorCoofe(Coofe coofe) {
        this.decoratorCoofe = coofe;
    }

    @Override
    public double getPrice() {
        return decoratorCoofe.getPrice();
    }

    @Override
    public String getIngredients() {
        return decoratorCoofe.getIngredients();
    }
}
