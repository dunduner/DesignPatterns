package com.mashibing.dp.proxy.My3Cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.sql.Time;

/**
 * @author zhangning
 * @date 2020/9/24
 */
public class Tank {
    public String move(String name){
        System.out.println(name+"tank run!");
        return "返回:"+name;
    }
    public  int age(){
        System.out.println("age=====");
        int i = 18;
        return i;
    }


    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new LogMethodInterceptor());
        Tank tank = (Tank)enhancer.create();
//        tank.move("舒克");

        tank.age();
    }

}
class LogMethodInterceptor implements MethodInterceptor{

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(o.getClass().getSuperclass().getName());
        System.out.println("参数数量:"+objects.length);

        System.out.println("before");
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("after");
        System.out.println(invoke);
        //invoke就是方法的返回值
        System.out.println("===================");
        return invoke;
    }
}


