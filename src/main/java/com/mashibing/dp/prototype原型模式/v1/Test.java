package com.mashibing.dp.prototype原型模式.v1;

/**
 * 浅克隆
 * prototype
 */

public class Test {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        Person p2 = (Person)p1.clone();
        System.out.println(p1==p2);//false


        System.out.println(p2.age + " " + p2.score);// 8  100
//        System.out.println(p2.loc);//bj  22
//
//        System.out.println(p1.loc == p2.loc);//true
//        p1.loc.street = "sh";//修改p1的信息  p2的信息也会同步改变
//        p1.loc.roomNo=7;
//        System.out.println(p2.loc);

    }
}

class Person implements Cloneable {
    int age = 8;
    int score = 100;

//    Location loc = new Location("bj", 22);
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Location {
    String street;
    int roomNo;

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", roomNo=" + roomNo +
                '}';
    }

    public Location(String street, int roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }
}
