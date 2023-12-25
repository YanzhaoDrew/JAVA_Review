package Review;

/**
 * ClassName: Equals_Test
 * Package: Review
 * Description:
 *  * 自定义的类在没有重写Object中equals()方法的情况下，调用的是Object类中声明的equals(),比较两个对象的引用地址是否相同。
 *  （或者比较两个对象是否指向了堆空间中的同一个对象实体）
 *  * 对于想String, File, Data和包装类等，它们都重写了Object类中的equals()方法,用于比较两个对象的实体内容是否相等
 * @Author Yanzhao-Chen
 * @Creat 2023/12/21 下午8:53
 * @Version 1.0
 */
public class Equals_Test {
    public static void main(String []args){
        User u1 = new User("ya", 2);
        User u2 = new User("ya", 2);
        System.out.println(u1.equals(u2));

        String s1 = "你好";
        String s2 = "你好";
        System.out.println(s1.equals(s2));
    }

}
class User{
    String name;
    int age;
    public User(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(name + " " + age);
    }
}
