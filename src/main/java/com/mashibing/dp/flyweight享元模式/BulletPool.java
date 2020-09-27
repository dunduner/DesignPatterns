package com.mashibing.dp.flyweight享元模式;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class Bullet {
    public UUID id = UUID.randomUUID();
    boolean living = true;

    @Override
    public String toString() {
        return "Bullet{" +
                "id=" + id +
                '}';
    }
}

public class BulletPool {
    List<Bullet> bullets = new ArrayList<>();

    {
        for (int i = 0; i < 5; i++) bullets.add(new Bullet());
    }

    public Bullet getBullet() {
        System.out.println();
        for (int i = 0; i < bullets.size(); i++) {
            Bullet b = bullets.get(i);
            b.living=false;
            System.out.println(b.living);
            if (!b.living) return b;
        }
        System.out.println(",没活着的了,直接new");
        return new Bullet();
    }

    public static void main(String[] args) {
        BulletPool bp = new BulletPool();

        for (int i = 0; i < 10; i++) {
            Bullet b = bp.getBullet();
            System.out.println(b);
        }
    }

}
