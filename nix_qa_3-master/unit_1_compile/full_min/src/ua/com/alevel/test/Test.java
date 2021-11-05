package ua.com.alevel.test;

import org.apache.commons.lang3.StringUtils;

public class Test {

    private static final String TEXT = "Test.print";

    public void print() {
        System.out.println("Test.print");
        System.out.println(StringUtils.upperCase(TEXT));
    }
}