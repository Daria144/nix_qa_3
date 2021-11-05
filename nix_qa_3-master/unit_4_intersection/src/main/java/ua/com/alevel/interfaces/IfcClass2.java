package ua.com.alevel.interfaces;

public class IfcClass2 implements Ifc1, Ifc2 {

    @Override
    public void run() {
        System.out.println("IfcClass2.run");
    }

    @Override
    public void test() {
        Ifc1.super.test();
    }
}

