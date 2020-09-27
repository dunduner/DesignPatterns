package com.mashibing.dp.observer观察者模式.aMy.v1;

/**
 * @author zhangning
 * @date 2020/9/23
 */
public class Child {
    Dad dad = new Dad();
    private boolean cry =false;

    public boolean isCry() {
        return cry;
    }
    public void wakeUp(){
        System.out.println("孩子哭了");
        cry =true;
        dad.feed();
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();

    }
}

class Dad{
    public void feed(){
        System.out.println("爸爸喂你吃饭,别哭了!");
    }
}


