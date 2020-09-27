package com.mashibing.dp.proxy.My3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author zhangning
 * @date 2020/9/24
 */
public class Tank implements MoveAble {
    @Override
    public void move(String tankName) {
        System.out.println("坦克:"+tankName+" !!!开了");

        try {
            Random random = new Random();
            TimeUnit.MILLISECONDS.sleep(random.nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        MoveAble moveAble = (MoveAble)Proxy.newProxyInstance(tank.getClass().getClassLoader(),
                new Class[]{MoveAble.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println(method.getName() + "before日志");
                        String s = String.valueOf(args[0]);
                        tank.move(s);
                        System.out.println(method.getName() + "after日志");
                        return null;
                    }
                });

        moveAble.move("舒克");
    }
}


interface MoveAble {
    void move(String tankName);
}