package com.mashibing.dp.command命令模式.my1;

/**
 * @author zhangning
 * @date 2020/9/25
 */
public class Test {
    public static void main(String[] args) {

        Content content = new Content("你好");

        CommandChain commandChain = new CommandChain();
        commandChain
                .addCommand(new AddZhang(content, ",张宁"))
                .addCommand(new AddZhang(content, ",晚上约吗?"))
                .addCommand(new AddZhang(content, "....估计你不去"));
        commandChain.doit(commandChain);

        System.out.println(content.msg);


        commandChain.undo(commandChain);
        System.out.println(content.msg);

    }
}
