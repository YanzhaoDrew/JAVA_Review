package Review;

import java.util.*;

/**
 * ClassName: MapTest
 * Package: Review
 * Description:
 *
 * @Author Yanzhao-Chen
 * @Creat 2023/12/24 下午7:49
 * @Version 1.0
 */
public class MapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        //无序：即与你插入的顺序无关
        //因为set本身就是无序，不重复的
        map.put(null, null);
        map.put("Tom", 23);
        map.put("CC", new Date());
        map.put(34, "AA");

        System.out.println(map);
        System.out.println(map.size());

        //删除
        map.remove("CC");
        System.out.println(map);

        //修改
        Object oldvalue = map.put("Tom", 66);
        System.out.println(map);
        System.out.println(oldvalue);

        //遍历
        Set keySet = map.keySet();
        //使用迭代器
        Iterator iterator = keySet.iterator();
        while(iterator.hasNext()){
            //遍历key
            System.out.println(iterator.next());
        }
        //遍历Values
        //方法一
        Collection values = map.values();
        for (Object obj: values){
            System.out.println(obj);
        }
        //方法二
        Set keySet1 = map.keySet();
        for (Object key: keySet1){
            Object value = map.get(key);
            System.out.println(value);
        }
        //
        Set entrySet = map.entrySet();
        Iterator iterator2 = entrySet.iterator();
        while(iterator2.hasNext()){
            //方式1：
            System.out.println(iterator2.next());
            //方式2：
//            Map.Entry entry = (Map.Entry) iterator2.next();
//            System.out.println(entry.getKey()+"---->"+entry.getValue());
        }
    }


}
