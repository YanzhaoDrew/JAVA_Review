package Review;

/**
 * ClassName: SwitchTest
 * Package: Review
 * Description:
 *  分支结构之switch-case的使用
 * @Author Yanzhao-Chen
 * @Creat 2023/12/21 下午7:30
 * @Version 1.0
 */
public class SwitchTest {
    public static void main(String[] args) {
        int a = 1;
        switch (a){
            case 3:
                System.out.println(2);
                break;
            case 2:
                System.out.println(3);
                break;
            default:
                System.out.println("Others");
        }
    }
}
