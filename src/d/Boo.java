package d;

public class Boo {

    public static void show(String... arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        show("1", "2", "3");
    }
}
