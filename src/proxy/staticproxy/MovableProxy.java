package proxy.staticproxy;

public class MovableProxy implements Movable {

    private final Movable movable;

    public MovableProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void show() {
        System.out.println("车的时间");
        movable.show();
    }
}
