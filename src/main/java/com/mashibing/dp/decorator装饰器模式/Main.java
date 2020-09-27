package com.mashibing.dp.decorator装饰器模式;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        File f = new File("c:/work/test.data");
        FileOutputStream fos = new FileOutputStream(f);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("http://www.mashibing.com");
        bw.flush();
        bw.close();
    }
}
