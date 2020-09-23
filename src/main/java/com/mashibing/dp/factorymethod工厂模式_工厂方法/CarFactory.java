package com.mashibing.dp.factorymethod工厂模式;

public class CarFactory {
    public Moveable create() {
        System.out.println("a car created!");
        return new Car();
    }
}
