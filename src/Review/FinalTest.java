package Review;

/**
 * ClassName: FinalTest
 * Package: Review
 * Description:
 *  final修饰类：表示此类不能被继承(such as String, )
 *  final修饰方法: 表示此方法不能够被重写(such as Object类中的getClass())
 *  final修饰变量: 既可以成员变量也可以局部变量。此时的变量就变成了“常量”，一旦赋值，不可更改
 * @Author Yanzhao-Chen
 * @Creat 2023/12/22 上午10:20
 * @Version 1.0
 */
public class FinalTest {

}

final class A{

}

//class B extends A{//cannot inherit from final 'Review.A'

//}
class C{
    public final void show(){

    }
}

class D extends C{
//    public void show(){}//'show()' cannot override 'show()' in 'Review.C'; overridden method is final
}