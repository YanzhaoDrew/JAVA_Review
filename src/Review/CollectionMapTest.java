package Review;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: CollectionMapTest
 * Package: Review
 * Description:
 *
 * @Author Yanzhao-Chen
 * @Creat 2023/12/24 下午9:29
 * @Version 1.0
 */
public class CollectionMapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();//后面<>为类型推断
        map.put("Tom",67);
        map.put("Kevin", 45);
        map.put("Rose", 99);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator= entrySet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
