package ua.com.alevel.interfaces;

import java.util.Date;

public final class CarDriver implements Driver {

    private int age;
    private String name;

    public CarDriver() { }

    public CarDriver(String name) { }

    public CarDriver(String name, int age) { }

    @Override
    public void drive() {
        final int age = 0;
        Math.sqrt(8);
        System.out.println("age = " + age);
        System.out.println("age = " + this.age);
        System.out.println("name = " + name);
        System.out.println("CarDriver.drive");
    }

    @Override
    public void stop() {
        System.out.println("CarDriver.stop");
    }
}
