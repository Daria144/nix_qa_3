package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class PrimitiveType {

    public void run() {
        System.out.println("PrimitiveType.run");

//        System.out.println(14 * 2);
//        System.out.println(14 << 1);
//        number();
//        character();
//        array();
//        circle();
//        inc();
//        edition();
    }

    private void edition() {
        int i = 3;

        boolean first = i == 2 || i <= 100;
        boolean second = i == 2 || i <= 100;

        if (i == 0) {}
        else if (i == 1 && i != 20) {}
        else if (first || second) {}
        else if (i == 3) {

        }
        else {}

        switch (i) {
            case 0 : {} break;
            case 1 : {} break;
            case 2 : {} break;
            case 3 : {
                System.out.println();
            }
            case 4 : {
                System.out.println();
            }
            default: {
                System.out.println();
            }
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String text = bufferedReader.readLine();
            int value = Integer.parseInt(text);
            if (value > 10) {
                System.out.println("> 10");
            } else {
                System.out.println("< 10");
            }
            String res = value > 10 ? "> 10" : "< 10";
            System.out.println("res = " + res);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void inc() {
        int i = 10;
//        i++;
//        ++i;

        System.out.println(++i);
        System.out.println("i = " + i);
    }

    private void circle() {
        int i = 10;
        for (int j = 0; j <= i; j++) {
            System.out.println("j = " + j);
        }

        System.out.println();

        for (int j = 0; j <= i; j += 2) {
            System.out.println("j = " + j);
        }

        for (int j = 0; j <= i; j += 2) {
            System.out.println("j = " + j);
        }

//        for (; ;) {
//
//        }

        System.out.println();

        int a = 0;
        while (a != 10) {
            System.out.println("a = " + a);
            ++a;
        }
    }

    private void array() {
        int[] ints = new int[5];
        ints[0] = 10;
        ints[3] = 16;

//        ints[5] = 10;

        for (int anInt : ints) {
            System.out.println("anInt = " + anInt);
        }

        int[] arr = { 0, 2, 7, 9, 0 };
        for (int i : arr) {
            System.out.println("i = " + i);
        }

        int[][] doubleArr = new int[3][];
        doubleArr[0] = new int[10];
        doubleArr[1] = new int[5];
        doubleArr[2] = new int[8];

        int[][] dArr = {
                {2, 6, 9, 71},
                {4, 90},
                {5, -9},
                {7, 89}
        };
        for (int i = 0; i < dArr.length; i++) {
            for (int j = 0; j < dArr[i].length; j++) {

            }
        }

        char[] chars = {'h', 'e', 'l', 'l', 'o'};

        String hello = "hello";

        for (char c : hello.toCharArray()) {
            System.out.println("c = " + c);
        }

    }

    private void character() {
        char i = 'i';
        System.out.println("i = " + i);
        System.out.println("i = " + (int)i);

        char dog = '@';
        System.out.println("dog = " + dog);
        System.out.println("dog = " + (int)dog);
    }

    private void number() {
        byte bMin = Byte.MIN_VALUE;
        byte bMax = Byte.MAX_VALUE;

        System.out.println("bMin = " + bMin);
        System.out.println("bMax = " + bMax);

        short sMin = Short.MIN_VALUE;
        short sMax = Short.MAX_VALUE;

        System.out.println("sMin = " + sMin);
        System.out.println("sMax = " + sMax);

        int iMin = Integer.MIN_VALUE;
        int iMax = Integer.MAX_VALUE;

        System.out.println("iMin = " + iMin);
        System.out.println("iMax = " + iMax);

        long lMin = Long.MIN_VALUE;
        long lMax = Long.MAX_VALUE;

        System.out.println("lMin = " + lMin);
        System.out.println("lMax = " + lMax);

        System.out.println((byte)(bMax + 1));
        System.out.println((byte)(bMax + bMax));

        String byteString = Integer.toBinaryString(bMin);
        System.out.println("byteString = " + byteString);

        for (int i = 0; i < Byte.MAX_VALUE; i++) {
            System.out.println(i + " = " + Integer.toBinaryString(i));
        }

        System.out.println(Long.MAX_VALUE + Long.MAX_VALUE);

        BigInteger left = new BigInteger(String.valueOf(Long.MAX_VALUE));
        BigInteger right = new BigInteger(String.valueOf(Long.MAX_VALUE));
        BigInteger sum = left.add(right);
        BigInteger mul = left.multiply(right);

        System.out.println(sum);
        System.out.println("mul = " + mul);

        double res = 2.0 - 1.0;
        System.out.println("res = " + res);
        res = 200.10 - 10.05;
        System.out.println("res = " + res);

        BigDecimal l = new BigDecimal("200.10");
        BigDecimal r = new BigDecimal("10.05");
        BigDecimal sub = l.subtract(r);
        System.out.println("sub = " + sub);
    }
}
