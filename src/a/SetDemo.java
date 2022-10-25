package a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetDemo {
    public static void main(String[] args) {
        /*不重复 无序 */
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("3");
        set.add("2");
        set.add("1");
        /*包含*/
        System.out.println(set.contains("5"));
        /*删除 存在删除并且返回true 不存在返回false*/
        System.out.println(set.remove("4"));

        Set<String> set1 = new HashSet<>();
        set1.add("1");
        set1.add("2");
        /*删除另一个集合存在所有的元素*/
        set.removeAll(set1);
        System.out.println(set);
    }
}
