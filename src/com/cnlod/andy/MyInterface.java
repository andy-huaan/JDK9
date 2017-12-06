package com.cnlod.andy;

public interface MyInterface {

    //接口定义普通方法
    void sayHelloToMe();

    /**
     * Java 8 为我们带来了接口的默认方法。 接口现在也可以包含行为，而不仅仅是方法签名。
     */
    default void sayHelloToOurTeam(){
        System.out.println("团队成员你们好");
    }

    default void sayHelloToMyLeader(){
        myInit("首长好！");
    }

    /**
     * This method is not part of the public API
     */
    private void myInit(String content){
        System.out.println(content);
    }
}
