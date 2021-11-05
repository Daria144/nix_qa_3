package ua.com.alevel;

import ua.com.alevel.classes.AccessClass;
import ua.com.alevel.data.DataClass;

public class AccessClass3 extends AccessClass {

    int age;

    private void test() {
        AccessClass accessClass = new AccessClass();
//        accessClass.s2 = "";
        accessClass.s3 = "";

        DataClass aClass = new DataClass();
//        aClass.id = -100L;
        aClass.setId(-100L);

    }
}
