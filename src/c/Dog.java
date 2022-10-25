package c;

/**
 * 动物 狗
 */
public class Dog extends AnimalNature implements Animal {

    public static final String HOME = "狗窝";

    /**
     * 狗的喜好
     */
    private String hobby;

    public Dog(Integer number, String name, String sex, String hobby) {
        super(number, name, sex);
        this.hobby = hobby;
    }

    @Override
    public void run(Integer distance) {
        System.out.println("狗在公路上跑了" + distance + "千米");
    }

    @Override
    public String toString() {
        return super.toString() + "狗的喜好是" + hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
