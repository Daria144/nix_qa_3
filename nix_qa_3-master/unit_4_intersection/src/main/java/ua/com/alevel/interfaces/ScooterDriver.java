package ua.com.alevel.interfaces;

public final class ScooterDriver implements Driver {

    @Override
    public void drive() {
        System.out.println("ScooterDriver.drive");
    }

    @Override
    public void stop() {
        System.out.println("ScooterDriver.stop");
    }
}
