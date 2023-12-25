package Review;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: FileStreamTest
 * Package: Review
 * Description:
 *  需求:复制一份jpg文件，命名为debo.jpg
 * @Author Yanzhao-Chen
 * @Creat 2023/12/25 上午1:02
 * @Version 1.0
 */
public class FileStreamTest {
    public static void writeTest() throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        //1. 创建相关的File类的对象
        File srcFile = new File("img.jpg");
        File destFile = new File("debo.jpg");

        //2. 创建相关的字节流
        fis = new FileInputStream(srcFile);
        fos = new FileOutputStream(destFile);

        //3. 数据的读入和写出
        //输出的方法：write(String str) or write(char[] cdata)
        byte[] buffer = new byte[1024]; //1kb
        int len;//记录每次读入到buffer中字节的个数
        while ((len = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }

        //4. 关闭资源
        fos.close();
        fis.close();
    }

    public static void main(String[] args) {
        try {
            writeTest();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
