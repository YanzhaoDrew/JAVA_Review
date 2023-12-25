package Review;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: ListTest
 * Package: Review
 * Description:
 *
 * @Author Yanzhao-Chen
 * @Creat 2023/12/24 下午2:26
 * @Version 1.0
 */
public class ListTest {
    public static void test(){
        List list = new ArrayList();
        list.add("AA");
        list.add(123);
        list.add(2);
        list.add("BB");

        System.out.println(list.toString());

        //删除索引为1的元素
        list.remove(1);
        System.out.println(list.toString());

        //删除数据2的元素
        list.remove(Integer.valueOf(2));
        System.out.println(list.toString());

        //遍历方式1
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //遍历方式2
        for(Object obj : list){
            System.out.println(obj);
        }
        //遍历方式3
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    public static void main(String []args){
        test();
    }
}
