package c;

public class Aoo<T, M> {
    private T o;
    private M m;

    public T getO() {
        return o;
    }

    public void setO(T o) {
        this.o = o;
    }

    public static void main(String[] args) {
        Aoo<String, Integer> aoo = new Aoo<>();
        aoo.setO("1");
        String o1 = aoo.getO();
        show(o1);
    }

    static <T> void show(T integer) {
        System.out.println(integer);
    }
}
