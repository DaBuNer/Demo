package b;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Aoo {

    public static void main(String[] args) throws Exception {
        /*第一种方式 forName*/
        Class<?> aClass = Class.forName("b.Boo");

        /*第二种方式*/
        Class<Boo> booClass = Boo.class;

        /*第三种方式 */
        Class<? extends Boo> aClass1 = new Boo().getClass();

        /*获取public的属性*/
        Field[] fields = aClass.getFields();

//        for (Field field : fields) {
//            System.out.println("属性名" + field.getName());
//            System.out.println("属性类型" + field.getType());
//        }

        /*获取所有的属性*/
//        Field[] declaredFields = aClass.getDeclaredFields();
//
//        Field a = aClass.getDeclaredField("a");
//        System.out.println("属性名" + a.getName());
////            System.out.println("属性值" + declaredField.get());
//        System.out.println("属性类型" + a.getType());
//
//        for (Field declaredField : declaredFields) {
//            System.out.println("属性名" + declaredField.getName());
////            System.out.println("属性值" + declaredField.get());
//            System.out.println("属性类型" + declaredField.getType());
//        }

//        Boo boo = booClass.newInstance();
//        Field b = aClass.getField("b");
//        /*初始化值*/
//        b.set(boo, 2);
//        System.out.println("b的值" + boo.b);
//        System.out.println("利用反射获取属性b的值:" + b.get(boo));
//
//        Field a = aClass.getDeclaredField("a");
//        /*跳过安全检查,可对属性a任意操作*/
//        a.setAccessible(true);
//        a.set(boo, 1);
//        System.out.println("利用反射获取属性a的值:" + a.get(boo));
//
//        Class<Person> personClass = Person.class;
//        Person person = personClass.newInstance();
//
//        for (Field declaredField : personClass.getDeclaredFields()) {
//            declaredField.setAccessible(true);
//            if ("java.lang.String".equals(declaredField.getType().getName())) {
//                declaredField.set(person, "张三");
//            } else if (declaredField.getType() == Integer.class) {
//                declaredField.set(person, 20);
//            }
//        }
//        System.out.println(person);
        /*child*/
//        Child child = new Child(1, "张三", 19);
//        /*person*/
//        Person person = toClass(child, Person.class);
//        System.out.println(person);
        /*构造*/
//        Object o = aClass.newInstance();
//        /*无参构造*/
//        Object o1 = aClass.getDeclaredConstructor().newInstance();
//        Boo o = booClass.getDeclaredConstructor(Integer.class).newInstance(1);
//        /*方法*/
//        Method[] methods = aClass.getMethods();
//        for (Method method : methods) {
//            System.out.println("方法的名字" + method.getName());
//        }
//        Method show = aClass.getMethod("show");
//        System.out.println("show方法" + show.getName());
        Method run = aClass.getDeclaredMethod("run");
        Boo boo = new Boo();
        boo.b = 1;
        run.invoke(boo);

        /*  map a 1 b 2 */

        /**/
    }

    public static <T> T toClass(Object o, Class<T> tClass) {
        T t = null;
        try {
            /*目标对象实例化*/
            t = tClass.newInstance();
            /*获取目标对象的属性*/
            for (Field declaredField : tClass.getDeclaredFields()) {
                declaredField.setAccessible(true);
                /*获取原对象的属性*/
                Field field = o.getClass().getDeclaredField(declaredField.getName());
                field.setAccessible(true);
                declaredField.set(t, field.get(o));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }


}

class Boo {
    private Integer a;
    public int b;

    protected int c;

    public String d;

    public Boo() {
    }

    public Boo(Integer a) {
        this.a = a;
    }

    private void show() {
        System.out.println("a的值:" + a);
    }

    public void run() {
        System.out.println("b的值:" + b);
    }
}

class Person {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Child {
    private Integer number;
    private String name;
    private Integer age;

    public Child(Integer number, String name, Integer age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    public Child() {
    }

    @Override
    public String toString() {
        return "Child{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

