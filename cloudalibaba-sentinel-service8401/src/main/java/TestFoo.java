import com.atguigu.springcloud.alibaba.Foo;

public class TestFoo {
    public static void main(String[] args) {
        //1）第一种情况：常量信息先加载，如果其中没有某个方法，会默认在枚举类中找然后调用
        //2）第二种情况：常量信息先加载，如果其中有某个方法，会就近找该方法然后调用
        //3）第三种情况：常量中有某个方法，但常量外没有该方法，会编译出错
        //思考：为什么编译出错？
        //猜想：编译期间，调用的方法默认只在枚举类中常量外检查。
        //运行期间，首先通过编译，即该方法在枚举类中常量外有，然后实际调用遵循就近原则，有则调用内部的，没有则调用外部的。
        System.out.println(Foo.VALUE_2.myMethod());

//        System.out.println(Foo.staticMethod());//直接调用静态方法
    }
}
