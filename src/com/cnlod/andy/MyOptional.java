package com.cnlod.andy;

import java.util.Optional;

/**
 * Java 8引入了一个新的Optional类
 * 这是一个可以为null的容器对象。如果值存在则isPresent()方法会返回true，调用get()方法会返回该对象
 */
public class MyOptional {

    public static void main(String[] args) {
        /**
         * 1.of方法通过工厂方法创建Optional类。需要注意的是，创建对象时传入的参数不能为null。如果传入参数为null，则抛出NullPointerException 。
         */
        Optional<String> name = Optional.of("Andy");
        /**
         * 2.ofNullable与of方法相似，唯一的区别是可以接受参数为null的情况
         * 为指定的值创建一个Optional，如果指定的值为null，则返回一个空的Optional。
         */
        Optional empty = Optional.ofNullable(null);
        //System.out.println(empty.isPresent()); //如果值存在返回true，否则返回false。

        //3.如果Optional实例有值则为其调用consumer，否则不做处理
        /*name.ifPresent((value) -> {
            System.out.println(value);
        });*/

        //4.orElse:如果有值则将其返回，否则返回指定的其它值。
        /*System.out.println(empty.orElse("没有值，采用此默认值!"));
        System.out.println(name.orElse("有值，不采用此默认值!"));*/

        /**
         * 5.orElseGet：orElseGet与orElse方法类似，区别在于得到的默认值。
         * orElse方法将传入的字符串作为默认值，orElseGet方法可以接受Supplier接口的实现用来生成默认值。示例如下：
         */
        //System.out.println(empty.orElseGet(() -> "Default Value"));
        //System.out.println(name.orElseGet(() -> "Default Value"));
    }
}
