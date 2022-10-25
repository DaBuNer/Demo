package proxy.dynamicproxy;

import java.lang.reflect.Proxy;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
//
//        Car car = new Car("小车");
//        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
//
//        Consumer<?> m = (Consumer<?>) Proxy.newProxyInstance(Car.class.getClassLoader(),
//                new Class[]{Consumer.class},
//                (proxy, method, arg) -> {
////                    System.out.println(method.getName());
//                    return method.invoke(car, arg);
//                });


//        Consumer<Runnable> consumer = (runnable) -> {
//            System.out.println("记录日志日志");
//            runnable.run();
//        };
//        consumer.accept(new Car("小车"));
//        System.out.println();
//        consumer.accept(new Plan("飞机"));
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println((char)i);
        }
    }
}
