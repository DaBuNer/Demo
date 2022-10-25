package c;

/**
 * 动物接口
 */
public interface Animal {
    String RACE = "动物";

    /**
     * 行为 跑的距离
     *
     * @param distance 距离
     */
    void run(Integer distance);

    default void show() {
        System.out.println("动物展示");
    }
}
