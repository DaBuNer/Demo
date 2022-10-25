package a;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        /*HashMap无序 key 不能重复 value 可以重复*/
        Map<Integer, String> map = new HashMap<>();
        /*新增*/
        map.put(1, "张三");
        map.put(5, "李四");
        map.put(4, "李四");
//        /*修改*/
//        System.out.println("map的返回值" + map.put(2, "王五"));
//        map.put(3, "王五");
//        /*删除*/
//        System.out.println("删除的值是:" + map.remove(2));

//        System.out.println(map.get(3));
//        System.out.println(map);
//        System.out.println(map);

        /*第一种遍历方式 通过keySet方法获取key的集合,遍历key通过HashMap的get方法获取value的值*/
        Set<Integer> set = map.keySet();
        /*增强for循环遍历key*/
        for (Integer i : set) {
            System.out.println("key:" + i + ",value" + map.get(i));
        }

        /*foreach遍历key*/
        set.forEach(key -> {
            System.out.println("key:" + key + ",value" + map.get(key));
        });


        System.out.println("第二种遍历方式");

        /*第二种遍历方式*/
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("key:" + entry.getKey() + ",value:" + entry.getValue());
        }
        /*学生学号: ** 学生姓名:*** */

    }
}
