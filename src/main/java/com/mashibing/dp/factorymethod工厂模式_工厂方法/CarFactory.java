package com.mashibing.dp.factorymethod工厂模式_工厂方法;

public class CarFactory {
    public Moveable create() {
        System.out.println("a car created!");
        return new Car();
    }
}
