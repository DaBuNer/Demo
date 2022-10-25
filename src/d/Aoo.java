package d;

import java.util.Arrays;

public class Aoo {
    public static void main(String[] args) {

        /*一共有n接台阶，如果一只小青蛙每次只能跳一阶台阶，或者两阶台阶，那么一共有多少种方案可以让小青蛙跳到顶端？*/
//        int t1 = 1;
//        int t2 = 2;
//        int n = 5;
//        if (n == 1) {
//            System.out.println(1);
//            return;
//        }
//        if (n == 2) {
//            System.out.println(2);
//            return;
//        }
//        for (int i = 3; i <= n; i++) {
//            int t = t2;
//            t2 = t1 + t2;
//            t1 = t;
//        }
//        System.out.println(t2);
        /*position = 6*/
        /*6 5 9 7 3 4 1 2*/
//        int[] arr = {6, 5, 9, 7, 3, 4, 1, 2};
//        sortArray(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));

//        System.out.println(0.7 * 0.7 * 0.3 / 3 - 0.6 * 0.6 * 0.6 * 0.6 * 0.4 / 5);
        /*RTYHBNKLBAMC   ABC*/
        for (int i = 0; i < 100; i++) {
            
        }
    }

    public static void sortArray(int[] arr, int left, int right) {
        if (left < right) {
            int position = getPosition(arr, left, right);
            sortArray(arr, left, position);
            sortArray(arr, position + 1, right);
        }
    }

    public static int getPosition(int[] arr, int left, int right) {
        int position = arr[left];       /*position = 6*/
        while (left < right) {          /*2 5 9 6 3 4 1 9*/
            while (left < right && arr[right] > position) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] < position) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = position;
        return left;
    }

}

