package com.cnlod.andy;

import java.util.List;
import java.util.Set;

/**
 * 集合工厂方法
 * 通常，您希望在代码中创建一个集合（例如，List 或 Set ），并直接用一些元素填充它。 实例化集合，几个 “add” 调用，使得代码重复。
 * Java 9，添加了几种集合工厂方法
 */
public class MyFactory {

    public static void main(String[] args) {
        Set sets1 = Set.of();//空集合
        System.out.println(sets1.size()+"==========");
        Set<String> sets2 = Set.of("a","b","c");
        System.out.println(sets2.size()+"---------");
        List<String> lists1 = List.of("h","m","d");
        System.out.println(lists1.size()+"++++++++++");
    }
}
