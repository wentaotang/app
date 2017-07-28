package com.hgcode.util.jdk8;

/**
 * Created by wentao on 2017/6/17.
 */
public class LambdaDemo {

    public static void main(String[] args) {
        System.out.println("=== RunnableTest ===");
        Runnable run1=new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world one!");
            }
        };

        Runnable run2=()-> System.out.println("hello world two!");

        run1.run();
        run2.run();
    }
}
