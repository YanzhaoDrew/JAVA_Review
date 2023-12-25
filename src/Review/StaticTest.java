package Review;

/**
 * ClassName: StaticTest
 * Package: Review
 * Description: Static方法测试
 * 可以通过“类.静态方法”的方式，直接调用静态方法
 *
 * @Author Yanzhao-Chen
 * @Creat 2023/12/22 上午10:00
 * @Version 1.0
 */
public class StaticTest {
    String name;

    public static void show(){
        //静态方法只能够调用静态属性和方法
        System.out.println("中国人");
        method1();

        //不能够调用非静态的结构
        //this会报错，且也不可以用super，因为没有对象之说
    }

    public static void method1(){
        System.out.println("调用方法一");
    }
}
