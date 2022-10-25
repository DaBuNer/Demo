package a;

import java.time.LocalDateTime;

public class Aoo {

    public void show(Boo boo) {
        //现在时间是[现在的时间(时间格式自定义)]
//        System.out.println("现在的时间是:" + LocalDateTime.now());
        boo.accept();
    }

}

interface Boo {
    void accept();
}

class Coo implements Boo {
    @Override
    public void accept() {
        System.out.println("现在的时间是" + LocalDateTime.now());
    }
}

class Main {
    public static void main(String[] args) {
        /**
         * 在main方法调用 Aoo的show方法
         */

        Boo boo = new Coo();
        System.out.println(boo.getClass());
//        new Aoo().show(new Coo());
    }
}