package c;

/**
 * 动物的属性
 */
public class AnimalNature {
    /**
     * 编号
     */
    private Integer number;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private String sex;

    public AnimalNature() {
    }

    public AnimalNature(Integer number, String name, String sex) {
        this.number = number;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "姓名:" + name + ",性别:" + sex + ",";
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
