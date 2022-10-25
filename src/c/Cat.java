package c;

/**
 * 动物 猫
 */
public class Cat extends AnimalNature implements Animal {

    /**
     * 玩具
     */
    private String toy;

    /**
     * 构造方法
     *
     * @param number 编号
     * @param name   姓名
     * @param sex    性别
     * @param toy    玩具
     */
    public Cat(Integer number, String name, String sex, String toy) {
        super(number, name, sex);
        this.toy = toy;
    }

    @Override
    public void show() {
        System.out.println("猫展示");
    }

    @Override
    public void run(Integer distance) {
        System.out.println("猫在家中跑了" + distance + "米");
    }

    @Override
    public String toString() {
        return super.toString() + "猫喜爱的玩具是" + toy;
    }

    public String getToy() {
        return toy;
    }

    public void setToy(String toy) {
        this.toy = toy;
    }
}
