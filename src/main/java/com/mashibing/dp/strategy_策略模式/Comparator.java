package com.mashibing.dp.strategy_策略模式;

public interface Comparator<T> {
    int compare(T o1, T o2);

    default void m() {
        System.out.println("m");
    }
}
