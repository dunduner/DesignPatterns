package com.mashibing.dp.command命令模式.my1;

import java.util.ArrayList;

/**
 * @author zhangning
 * @date 2020/9/25
 */
public class CommandChain extends Command {
    ArrayList<Command> commandList = new ArrayList<>();
    int index = 0;

    public CommandChain addCommand(Command command) {
        commandList.add(command);
        return this;
    }


    @Override
    public void doit(Command command) {
        if (index >= commandList.size()) {
            return;
        }
        Command commandnext = commandList.get(index);
        index++;
        commandnext.doit(this);
    }

    @Override
    public void undo(Command command) {
        if(index<0){
            return;
        }else if(index==commandList.size()){
            index--;
        }
        Command commandWanghui = commandList.get(index);
        index --;
        commandWanghui.undo(this);



    }
}
