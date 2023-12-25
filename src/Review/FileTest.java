package Review;

import java.io.File;

/**
 * ClassName: FileTest
 * Package: Review
 * Description:
 *
 * @Author Yanzhao-Chen
 * @Creat 2023/12/24 下午11:23
 * @Version 1.0
 */
public class FileTest {
    public static void main(String[] args) {
        File file1 = new File(".");
        System.out.println(file1.getAbsolutePath());

        String[] fileArr = file1.list();
        for (String s: fileArr){
            System.out.println(s);
        }
    }

}
