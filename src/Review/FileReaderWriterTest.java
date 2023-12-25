package Review;

import java.io.*;

/**
 * ClassName: FileReaderWriterTest
 * Package: Review
 * Description:
 *
 * @Author Yanzhao-Chen
 * @Creat 2023/12/25 上午12:26
 * @Version 1.0
 */
public class FileReaderWriterTest {
    /**
     * 需求：读取文件中的内容，显示在控制台上
     * 使用try-catch-finally的方式处理异常，确保流一定可以关闭，避免内存泄露
     */
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        try {
            //1. 创建File类的对象，对应着hello.txt文件
            File file = new File("stud.txt");
            //2. 创建输入型的字符流，用于读取数据
            fr = new FileReader(file);
            //3. 读取数据，并显示在控制台上
//        System.out.println((char)fr.read());
            //方法一：
//        int data = fr.read();
//        while(data != -1){
//            System.out.print((char)data);
//            data = fr.read();
//        }
            //方法二：
//            int data;
//            while((data = fr.read()) != -1){
//                System.out.print((char)data);
//            }
            //方法三：每次读取多个字符存放到字符数组中，减少了与磁盘交互的次数，提升了效率
            char[] cbuffer = new char[5];
            int len;
            while ((len = fr.read(cbuffer)) != -1){
                for (int i = 0; i < len; i++) {
                    System.out.print(cbuffer[i]);
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //4. 流资源的关闭操作(必须要关闭，否则内存会泄露)
            try {
                if (fr != null)
                    fr.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        writeTest();
    }
    public static void writeTest() throws IOException{
        FileWriter fw = null;
        //1. 创建File类的对象，指明要写出的文件的名称
        File file = new File("Workshop.txt");

        //2. 创建输出流
//        FileWriter fw = new FileWriter(file);默认覆盖
//        fw = new FileWriter(file, false);false代表覆盖
        fw = new FileWriter(file, true);//true代表续写

        //3. 写出的具体过程
        //输出的方法：write(String str) or write(char[] cdata)
        fw.write("I Love U!\n");
        fw.write("Merry Christmas!!!\n HHH");

        //4. 关闭资源
        fw.close();
    }
}
