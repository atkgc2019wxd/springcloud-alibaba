package com.atguigu.springcloud.alibaba;

public enum Foo {
    //常量列表
    VALUE_1 {
        public int myVariable = 1;
    },
    VALUE_2 {
        int i=1;
        public int myMethod() {
            return 2;
        }
    };

    public int myMethod() {
        System.out.println("===");
        return 3;
    }

    public static int staticMethod() {
        System.out.println("===");
        return 4;
    }
}
