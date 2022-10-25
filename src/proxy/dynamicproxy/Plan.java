package proxy.dynamicproxy;

public class Plan implements Runnable {
    private final String name;

    public Plan(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("飞机的名字是:" + name);
    }
}
