package com.mashibing.dp.decorator装饰器模式.my1;

/**
 * @author zhangning
 * @date 2020/9/27
 */
public class SimpleCoofe implements Coofe {

    @Override
    public double getPrice() {
        return 10;
    }

    @Override
    public String getIngredients() {
        return "咖啡粉";
    }


    public static void main(String[] args) {
        SimpleCoofe simpleCoofe = new SimpleCoofe();

        AddMilk addMilk = new AddMilk(simpleCoofe);

        AddSugar addSugar = new AddSugar(addMilk);


        System.out.println(addSugar.getPrice());
        System.out.println(addSugar.getIngredients());
    }
}
