package ua.com.alevel.interfaces;

public class IfcClass1 implements Ifc1, Ifc2 {

    @Override
    public void run() {
        System.out.println("IfcClass1.run");
    }
}
