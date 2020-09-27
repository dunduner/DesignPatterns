package com.mashibing.dp.command命令模式.my1;

/**
 * @author zhangning
 * @date 2020/9/25
 */
public abstract class Command {
    //责任responsibilit
    public abstract void doit(Command command);

    public abstract void undo(Command command);


}
