package ua.com.alevel;

import ua.com.alevel.test.Test;

class Main {

    public static void main(String[] args) {
        System.out.println(Main.class.getName());
        Test test = new Test();
        test.print();
    }
}