import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "金夏安");
        map.put(2, "魏来");
        map.put(3, "陈瑜皙");
        map.put(4, "丁堉茜");
        map.put(5, "冯佳路");
        map.put(6, "龚杨芸");
        map.put(7, "李想");
        map.put(8, "涂依婷");
        map.put(9, "赵雨诺");
        map.put(10, "赵袁甲");
        map.put(11, "曾灿");
        map.put(12, "陈逸霖");
        map.put(13, "何润杰");
        map.put(14, "胡明浩");
        map.put(15, "胡印桓");
        map.put(16, "花忠");
        map.put(17, "黄培峻");
        map.put(18, "蒋秉辰");
        map.put(19, "林勇智");
        map.put(20, "刘祖豪");
        map.put(21, "卢铭顺");
        map.put(22, "鲁顺强");
        map.put(23, "潘子豪");
        map.put(24, "沈佳俊");
        map.put(25, "王冠腾");
        map.put(26, "王青禄");
        map.put(27, "魏泽峰");
        map.put(28, "吴澳宇");
        map.put(29, "肖玉明");
        map.put(30, "杨光宇");
        map.put(31, "张文宇");
        map.put(32, "周鑫");
        map.put(33, "朱德龙");
        map.put(34, "苏鑫");
        map.put(35, "贾顺伟");
        map.put(36, "张钰霄");
        map.put(37, "郭有鑫");
//        /*[0, 1) * 37 -> [0.0, 37.0) (int) -> [0, 36] + 1 -> [1, 37]*/
        int i = (int) (Math.random() * 37);
        System.out.println(map.get(i + 1));
////
//        Set<Integer> set = map.keySet();
////        for (Integer key : set) {
////            System.out.println("学生学号:" + key + "学生姓名:" + map.get(key));
////        }
//
//        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//
//        for (Map.Entry<Integer, String> entry : entries) {
//            System.out.println("学生学号:" + entry.getKey() + "学生姓名:" + entry.getValue());
//        }
//        /*所有的集合都有foreach*/
//
//
//        map.forEach((key, value) -> System.out.println("学生学号:" + key + "学生姓名:" + value));

    }
}
