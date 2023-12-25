package Review;

/**
 * ClassName: ThreadTest
 * Package: Review
 * Description:
 *  创建一个分线程1，用于遍历100以内的偶数
 * @Author Yanzhao-Chen
 * @Creat 2023/12/22 下午10:29
 * @Version 1.0
 */
public class ThreadTest {

    public static void main(String[] args) {
        //第一种方法
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    if (i % 2 == 0) System.out.println(Thread.currentThread().getName() + i);
                }
            }
        }.start();

        new Thread(){
            public void run(){
                for (int i = 0; i <= 100; i++) {
                    if (i % 2 != 0) System.out.println(Thread.currentThread().getName() + i);
                }
            }
        }.start();

        //第二种方法
        EvenNumberPrint p = new EvenNumberPrint();
        Thread t1 = new Thread(p);//注意要将上面对象作为参数传入Thread类的构造器中，创建Thread的实例
        t1.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    if (i % 2 == 0) System.out.println(i);
                }
            }
        }){}.start();
    }

}
//第一种方法创建
class PrintNumber extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }
}
//第二种方法创建
class EvenNumberPrint implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }
}