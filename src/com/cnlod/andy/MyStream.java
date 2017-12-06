package com.cnlod.andy;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 改进的 Stream API
 * 长期以来，Stream API 都是 Java 标准库最好的改进之一。通过这套 API 可以在集合上建立用于转换的申明管道。在 Java 9 中它会变得更好。
 * Stream 接口中添加了 4 个新的方法：dropWhile, takeWhile, ofNullable。还有个 iterate 方法的新重载方法，
 * 可以让你提供一个 Predicate (判断条件)来指定什么时候结束迭代：
 */
public class MyStream {

    public static void main(String[] args) {
        IntStream.iterate(1,i -> i<10,i -> i+1).forEach(System.out::println);

        Stream<Integer> it = Optional.of(2).stream();
        System.out.println("=="+it.count());


    }
}
