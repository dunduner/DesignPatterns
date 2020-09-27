package com.mashibing.dp.adapter.My1;

import java.awt.*;

/**
 * @author zhangning
 * @date 2020/9/25
 */
public class Test {
    public static void main(String[] args) {
//        Frame frame = new Frame();
//        frame.addWindowListener(new interface);


        ManyMethodDemo manyMethodDemo = new ManyMethodDemo();
        manyMethodDemo.addManyMethodInterface(new ManyMethodsImpl() {
            @Override
            public void method1() {
                super.method1();
            }
        });

    }

}
