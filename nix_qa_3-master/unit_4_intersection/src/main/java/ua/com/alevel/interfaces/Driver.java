package ua.com.alevel.interfaces;

public abstract sealed interface Driver permits CarDriver, ScooterDriver {

    public static final int age = 10;

    public abstract void drive();
    public abstract void stop();

    public default void test() {
        System.out.println("Driver.test");
    }
}
