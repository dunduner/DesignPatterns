package com.mashibing.dp.builder.my1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author zhangning
 * @date 2020/9/25
 */
public class Main {


    public static void main(String[] args) {
       Student stu = new Student.StudentBulider()
               .baseInfo("张三",99,"十一中")
//               .body("188cm","100公斤")
//               .buliderScore(99)
//               .buliderLocation("上海","200号")
               .builder();

        System.out.println(stu);


    }
}
