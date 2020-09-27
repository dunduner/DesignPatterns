package com.mashibing.dp.state.car;

/**
 * @author zhangning
 * @date 2020/9/27
 */
public class OpenState extends CarState {
    @Override
    void openDoor() {
        System.out.println("已经开门了");
    }

    @Override
    void closeDoor() {
        System.out.println("可以关门");
    }

    @Override
    void runTheCar() {
        System.out.println("关门后才能开车");
    }

    @Override
    void stopTheCar() {
        System.out.println("还没开车，何来停车");
    }
}
