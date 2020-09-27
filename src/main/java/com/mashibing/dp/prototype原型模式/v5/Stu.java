package com.mashibing.dp.prototype原型模式.v5;

import com.mashibing.dp.builder.Person;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Objects;

/**
 * @author zhangning
 * @date 2020/9/25
 */
public class Stu implements Cloneable {
    String name;
    String age;

    public Stu(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }


    @Override
    public int hashCode() {
        System.out.println(Objects.hash(name, age));
        return Objects.hash(name, age);
    }

    public static void main(String[] args) throws Exception {

//        Stu stu = new Stu();
//        stu.name = "张三";
//        stu.age = "18";
//
//        Stu stu1 = (Stu)stu.clone();
//        stu1.age = "99";
//        System.out.println(stu ==stu1);
//        System.out.println(stu);
//        System.out.println(stu1);
        Stu p1 = new Stu("aaa", "18");
        Stu p2 = new Stu("aaa", "18");
        HashMap<Stu, String> map = new HashMap<>();
        map.put(p1, "这是p1");
        map.put(p2, "这是p2");
        System.out.println(map.get(p1));
        System.out.println(map.get(p2));


        System.out.println("=====================");
        int a = 1000, b = 1000;
        System.out.println(a == b);//1
        Integer a1 = 1000, b1 = 1000;
        System.out.println(a1 == b1);//1
        Integer c = 100, d = 100;
        System.out.println(c == d);//2


        System.out.println("=====================");
        Class cache = Integer.class.getDeclaredClasses()[0]; //1
        Field myCache = cache.getDeclaredField("cache"); //2
        myCache.setAccessible(true);//3

        Integer[] newCache = (Integer[]) myCache.get(cache); //4
        newCache[132] = newCache[133]; //5

        int aa = 2;
        int bb = aa + aa;
        System.out.printf("%d + %d = %d", aa, aa, bb); //

    }
}
