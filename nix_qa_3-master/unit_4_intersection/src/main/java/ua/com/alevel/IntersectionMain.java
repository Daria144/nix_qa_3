package ua.com.alevel;

import ua.com.alevel.interfaces.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class IntersectionMain {

    public static void main(String[] args) {

        List<ScooterDriver> scooterDrivers = new ArrayList<>();
        scooterDrivers.add(new ScooterDriver());
        scooterDrivers.add(new ScooterDriver());
        scooterDrivers.add(new ScooterDriver());

        for (ScooterDriver scooterDriver : scooterDrivers) {
            scooterDriver.stop();
        }

        System.out.println();

        List<Driver> drivers = new ArrayList<>();
        drivers.add(new ScooterDriver());
        drivers.add(new CarDriver());
        drivers.add(new CarDriver());

//        Driver driver1 = new Driver() {
//
//            @Override
//            public void drive() {
//                System.out.println("random.drive");
//            }
//
//            @Override
//            public void stop() {
//                System.out.println("random.stop");
//            }
//        };

//        drivers.add(driver1);

        for (Driver driver : drivers) {
            driver.drive();
        }

//        IfcClass1 ifcClass = new IfcClass1();
//        ifcClass.run();
//
//        Ifc1 ifc1 = new IfcClass1();
//        ifc1.run();
//
//        ifc1 = new IfcClass2();
//        ifc1.run();


//        System.out.println("InnerEnum.LOADED = " + InnerEnum.LOADED);
//        System.out.println("InnerEnum.LOADED = " + InnerEnum.LOADED.getViewName());
//        System.out.println("InnerEnum.LOADED = " + InnerEnum.LOADED.getId());
//
//        for (InnerEnum value : InnerEnum.values()) {
//            System.out.println("value = " + value);
//        }
//
//        Client client = new Client();
//        System.out.println("client = " + client.getGenderType().getEnType());
//        System.out.println("client = " + client.getGenderType().getRuType());
//        Document document = new Document();
//        document.setCreated(new Date());
//        document.setPrice(new BigDecimal("100.00"));
//        document.setId(UUID.randomUUID().toString());
//        document.setStatus(DocumentStatus.LOADED);
//
//        System.out.println("document = " + document);
//
//        document.setStatus(DocumentStatus.SUCCEED);
//
//        System.out.println("document = " + document);


//        System.out.println("IntersectionMain.main");
//
//        AccessClass accessClass;
//
//        DataClass dataClass = new DataClass();
////        BaseClass baseClass = new BaseClass();
//
//        StaticClass staticClass = new StaticClass();
//        staticClass.INT2 = 10;
//        StaticClass.INT = 10;
//
//
//        StaticClass.test();
//
//        double sqrt = Math.sqrt(10);
//        String s = "text".toUpperCase();
//
//        User user1 = new User("test1");
//        user1.setInn("INN1");
//        System.out.println("user1 = " + user1.getName());
//        System.out.println("user1 = " + user1.getInn());
//
//        User user2 = new User("test2");
//        user2.setInn("INN2");
//        System.out.println("user2 = " + user2.getName());
//
//        user2 = user1;
//        System.out.println("user2 = " + user2.getName());
//        System.out.println("user2 = " + user2.getInn());
//
//        user2.setInn("new_INN");
//        System.out.println("user1 = " + user1.getInn());
//
//        ImmutableClass immutableClass = new ImmutableClass("test", "pass");
//        RecordClass recordClass = new RecordClass("test", "test", "blablabla");
//
//        System.out.println("immutableClass = " + immutableClass.getLogin());
//        System.out.println("recordClass = " + recordClass.login());
    }
}
