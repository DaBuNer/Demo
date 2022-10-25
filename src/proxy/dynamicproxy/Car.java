package proxy.dynamicproxy;

import java.util.function.Consumer;

public class Car implements Runnable, Consumer<String> {
    private final String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("车的名字是" + name);
    }

    @Override
    public void accept(String s) {
        System.out.println("这个是" + s);
    }
}
