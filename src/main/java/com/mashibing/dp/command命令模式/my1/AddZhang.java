package com.mashibing.dp.command命令模式.my1;

/**
 * @author zhangning
 * @date 2020/9/25
 */
public class AddZhang extends Command {
    Content content;
    String addMsg;

    public AddZhang(Content content, String addMsg) {
        this.content = content;
        this.addMsg = addMsg;
    }

    @Override
    public void doit(Command command) {
        content.msg = content.msg + addMsg;
        command.doit(command);
    }


    @Override
    public void undo(Command command) {
        String nowStr = content.msg;
        String deleteok = nowStr.substring(0, nowStr.length() - addMsg.length());
        content.msg = deleteok;
        command.undo(command);
    }


}
