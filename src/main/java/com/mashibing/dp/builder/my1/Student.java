package com.mashibing.dp.builder.my1;

import com.sun.xml.internal.ws.api.message.saaj.SAAJMessageHeaders;

/**
 * @author zhangning
 * @date 2020/9/25
 */
public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                ", hight='" + hight + '\'' +
                ", weight='" + weight + '\'' +
                ", score=" + score +
                ", location=" + location +
                '}';
    }

    String name;
    int age;
    String school;

    String hight;
    String weight;
    int score;
    Location location;

    private Student() {
    }

    //静态内部类
    public static class StudentBulider {
        Student s = new Student();

        public StudentBulider baseInfo(String name, int age, String school) {
            s.name = name;
            s.age = age;
            s.school = school;
            return this;
        }

        public StudentBulider body(String hight, String weight) {
            s.hight = hight;
            s.weight = weight;
            return this;
        }

        public StudentBulider buliderScore(int score) {
            s.score = score;
            return this;
        }

        public StudentBulider buliderLocation(String city, String roomNum) {
            Location location = new Location(city, roomNum);
            s.location = location;
            return this;
        }


        public Student builder() {
            return s;
        }
    }

}

class Location {
    private String city;
    private String roomNum;

    public Location(String city, String roomNum) {
        this.city = city;
        this.roomNum = roomNum;
    }
}
