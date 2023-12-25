package Review;

import java.io.File;

/**
 * ClassName: ToStringTest
 * Package: Review
 * Description:
 *
 * @Author Yanzhao-Chen
 * @Creat 2023/12/21 下午9:23
 * @Version 1.0
 */
public class ToStringTest {
    public static void main(String[] args) {
        User u1 = new User("Tom", 12);
        System.out.println(u1.toString());// Review.User@452b3a41

        String s1 = "hello";
        System.out.println(s1.toString());// hello

        File file = new File("/home/drew1");
        System.out.println(file.toString());

    }

}
