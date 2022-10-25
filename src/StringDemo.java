public class StringDemo {

    static int a = 0;

    public static void main(String[] args) {
//        /*放在常量池*/
//        String str = "Hello World";
//        String str3 = "Hello World";
//        /*放在堆中*/
//        String str1 = new String("Hello World");
//        String str4 = new String("Hello World");
//
////        System.out.println(str == str3);
//        str = "Hello";
//        System.out.println(str3);

//        int[] arr = {2, 4, 7, 3, 9, 1, 5};
        /*max = 调用方法求最大值*/
        /*System.out.println(max);*/
//        String s = "Hello World";
        /*查找位置*/
//        System.out.println(s.indexOf('o'));
//        /*[*/
//        System.out.println(s.indexOf('o', 4));
//
//        System.out.println("从后面开始第一个字符的位置" + s.lastIndexOf('o'));
//
//        System.out.println("Hello的位置" + s.indexOf("Hello"));
//
//        System.out.println("Hello的位置从1开始找" + s.indexOf("Hello", 1));

        /*查看位置的值*/
//        System.out.println(s.charAt(0));

//        System.out.println(s.substring(6));
        /*[ , )*/
//        System.out.println(s.substring(6, 7));
//
//        String o = s.replace('o', '!');
//        System.out.println(o);
//        System.out.println(s);
//
//        String s1 = s.replace("Hello", "Hi");
//        System.out.println(s1);
//        String s = "1,2,3,4,5,6,7";

//        String[] split = s.split("");


        /**
         * 已知字符串 "{2; 4; 7; 3; 9; 1; 5}"
         * 将';'替换为','输出字符串
         *
         * 并且将字符串转为数组遍历打印输出
         */


//        String s = "{2; 4; 7; 3; 9; 1; 5}";
//
//        String substring = s.substring(1, s.length() - 1);
//        System.out.println(substring);

//        System.out.println("1" + "1");


//        String str = "Hello";
//        String str1 = new String("Hello");
//        System.out.println(str.equals(str1));
//        show();
//        show(2);
//        show(2, "name");
//        System.out.println(1 + 1 + "1" + 1 + 1);

        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    StringDemo.show();
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                StringDemo.show();
            }
        };
        t1.start();
        t2.start();


    }


    /*Overload*/
    static void show() {
        System.out.println(a);
        try {
            Thread.sleep(10);
        } catch (Exception ignored) {
        }
        a++;
    }

    static void show(int a) {
        System.out.println(a);
    }

    static int show(int a, String name) {
        System.out.println(name + ":" + a);
        return 1;
    }

    /*
     * 返回类型(int void double等任何类) 方法名称(小驼峰) {
     *      方法体;
     * }
     *
     */

    //    public static void show() {
//        System.out.println(1);
//    }
    public static float showName() {
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        return 11.0f;

    }

}
