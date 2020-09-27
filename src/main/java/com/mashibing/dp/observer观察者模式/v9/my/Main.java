package com.mashibing.dp.observer观察者模式.v9.my;

import java.util.ArrayList;

/**
 * @author zhangning
 * @date 2020/9/24
 */
public class Main {

    public static void main(String[] args) {
        Button button = new Button();
        button.addActionListener(new Action1()).addActionListener(new Actiuon2());
        button.buttonPresso();
    }
}
//观察者
class Action1 implements ActionListener {

    @Override
    public void actionCommit(ActionEvent actionEvent) {
        Button source = (Button)actionEvent.getSource();
        System.out.println(source.getClass().getName());
        System.out.println("观察者1  .....");

    }
}

class Actiuon2 implements ActionListener {
    @Override
    public void actionCommit(ActionEvent actionEvent) {
        System.out.println("观察者2......");
    }
}

//观察者接口
interface ActionListener {
    void actionCommit(ActionEvent actionEvent);
}

//事件源
class Button {
    //监听者集合
    ArrayList<ActionListener> actionListeners = new ArrayList<>();

    //添加事件源的监听者
    public Button addActionListener(ActionListener actionListener) {
        actionListeners.add(actionListener);
        return this;
    }

    //遍历观察者列表,并触发 观察者
    public void buttonPresso() {
        ActionEvent actionEvent = new ActionEvent(this, System.currentTimeMillis());
        for (ActionListener actionListener : actionListeners) {
            actionListener.actionCommit(actionEvent);
        }
    }
}


//事件
class ActionEvent {
    Object source;
    long time;

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public ActionEvent(Object source, long time) {
        this.source = source;
        this.time = time;
    }
}