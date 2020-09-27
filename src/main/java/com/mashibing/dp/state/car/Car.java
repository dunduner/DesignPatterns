package com.mashibing.dp.state.car;

/**
 * @author zhangning
 * @date 2020/9/27
 */
public class Car {
    String carName;
    CarState carState;

    public Car(String carName, CarState carState) {
        this.carState = carState;
        this.carName = carName;
    }

    public void openDoor() {
        carState.openDoor();
    }

    public void closeDoor() {
        carState.closeDoor();
    }

    public void run() {
        carState.runTheCar();
    }

    public void stop() {
        carState.stopTheCar();
    }

    public static void main(String[] args) {


        Car car = new Car("奔驰",new OpenState());
        car.openDoor();
        car.closeDoor();
        car.run();
        car.stop();

    }
}
