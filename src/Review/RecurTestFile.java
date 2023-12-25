package Review;

import java.io.File;
import java.io.FileFilter;

/**
 * ClassName: RecurTestFile
 * Package: Review
 * Description:
 *
 * @Author Yanzhao-Chen
 * @Creat 2023/12/24 下午11:56
 * @Version 1.0
 */
public class RecurTestFile {
    //public void printFileName(File file) //file可能是文件，也可能是文件目录
    public static void test1(){
        File file = new File(".");
        printFileName(file);
    }
    public static void printFileName(File file){
        if (file.isFile()){
            System.out.println(file.getName());
        }else if(file.isDirectory()){
            File[] files = file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.getName().endsWith("txt");
                }
            });
            for (File f: files){
                printFileName(f);
            }
        }
    }


    public static void main(String[] args) {
        test1();
    }
}
