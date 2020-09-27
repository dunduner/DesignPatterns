package com.mashibing.dp.proxy.My;

import com.mashibing.dp.factorymethod工厂模式_工厂方法.Moveable;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author zhangning
 * @date 2020/9/24
 */
public class Tank implements MoveAble {


    public static void main(String[] args) {
//        new Tank().move();
        Tank tank = new Tank();
        new TimeProxy1(tank).move();
        new LogProxy1(tank).move();
    }


    @Override
    public void move() {
        System.out.println("坦克 !!!开了");

        try {
            Random random = new Random();
            TimeUnit.MILLISECONDS.sleep(random.nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//创建一个代理 也会move
class TimeProxy1 implements MoveAble {
    private Tank tank;

    public TimeProxy1(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        tank.move();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
class LogProxy1 implements MoveAble {
    private Tank tank;

    public LogProxy1(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        tank.move();
        System.out.println("记录一个日志!");
    }
}


interface MoveAble {
    void move();
}