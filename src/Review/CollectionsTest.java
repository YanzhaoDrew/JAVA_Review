package Review;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ClassName: CollectionsTest
 * Package: Review
 * Description:
 *
 * @Author Yanzhao-Chen
 * @Creat 2023/12/24 下午9:11
 * @Version 1.0
 */
public class CollectionsTest {
    public static void main(String[] args) {
        List list = Arrays.asList(45, 43, 65, 23, 53, 64, 23, 12);
        System.out.println(list);//[45, 43, 65, 23, 53, 64, 23, 12]

        //反转
        Collections.reverse(list);
        System.out.println(list);

        //排序, 升序
        Collections.sort(list);
        System.out.println(list);//[12, 23, 23, 43, 45, 53, 64, 65]
        //降序
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2){
                if (o1 instanceof Integer && o2 instanceof Integer){
                    Integer i1 = (Integer) o1;
                    Integer i2 = (Integer) o2;
                    return - (i1.intValue() - i2.intValue());
                }
                throw new RuntimeException("类型不匹配");
            }
        });
        System.out.println(list);
    }
}
