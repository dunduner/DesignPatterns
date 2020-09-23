package com.mashibing.dp.factorymethod工厂模式;

public class Main {
    public static void main(String[] args) {
        Moveable m = new CarFactory().create();
        m.go();
    }
}
