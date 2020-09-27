package com.mashibing.dp.state.car;

/**
 * @author zhangning
 * @date 2020/9/27
 */
public abstract class CarState {
    abstract void openDoor();

    abstract void closeDoor();

    abstract void runTheCar();

    abstract void stopTheCar();

}
