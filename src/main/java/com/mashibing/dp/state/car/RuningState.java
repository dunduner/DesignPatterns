package com.mashibing.dp.state.car;

/**
 * @author zhangning
 * @date 2020/9/27
 */
public class RuningState extends CarState {
    @Override
    void openDoor() {
        System.out.println("不能开门");
    }

    @Override
    void closeDoor() {
        System.out.println("不能关门");
    }

    @Override
    void runTheCar() {
        System.out.println("已经在开车了");
    }

    @Override
    void stopTheCar() {
        System.out.println("可以停车");
    }
}
