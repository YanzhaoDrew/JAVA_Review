package Review;

import java.util.Scanner;

/**
 * ClassName: ScannerTest
 * Package: Review
 * Description:
 *  使用Scanner获取不同类型数据的步骤：
 *
 * @Author Yanzhao-Chen
 * @Creat 2023/12/21 下午7:08
 * @Version 1.0
 */
public class ScannerTest {
    public static void main(String []args){
        //提供创建一个Scanner类
        Scanner keyboard = new Scanner(System.in);

        //调用Scanner类中的方法
        //对于String类型:
        String name = keyboard.next();
        System.out.println(name);
        //对于int类型
        int age = keyboard.nextInt();
        System.out.println(age);
        //对于double类型
        double weight = keyboard.nextDouble();
        System.out.println(weight);
        //对与boolean
        boolean isSingle = keyboard.nextBoolean();
        System.out.println(isSingle);

        //对于char，没有提供， 因此需要String charAt方法
        char gender = keyboard.next().charAt(0);
        System.out.println(gender);

        //额外提一点：获取随机数可以使用Math包下的东西,[0.0, 1.0)
        double random_number = Math.random();
        System.out.println(random_number);
    }
}
