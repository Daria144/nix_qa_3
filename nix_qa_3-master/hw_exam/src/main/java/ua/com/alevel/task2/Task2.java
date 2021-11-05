package ua.com.alevel.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {

    public void run(BufferedReader reader) {
        System.out.println("Task2.run");
        System.out.println("Please, enter some text");

        String somethingText = null;
        try {
            somethingText = reader.readLine();
            char[] chars = somethingText.toCharArray();
//            firstVariant(chars);
            secondVariant(chars);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void secondVariant(char[] chars) {
        CharInt[] charInts = new CharInt[0];
        for (char currentChar : chars) {
            if (charInts.length == 0) {
                CharInt newCharInt = new CharInt();
                newCharInt.letter = currentChar;
                newCharInt.count = 1;
                charInts = new CharInt[1];
                charInts[0] = newCharInt;
            } else {
                boolean existChar = false;
                for (CharInt charInt : charInts) {
                    if (currentChar == charInt.letter) {
                        existChar = true;
                        charInt.count++;
                    }
                }
                if (!existChar) {
                    CharInt newCharInt = new CharInt();
                    newCharInt.letter = currentChar;
                    newCharInt.count = 1;
                    CharInt[] tempCharInts = new CharInt[charInts.length + 1];
                    System.arraycopy(charInts, 0, tempCharInts, 0, charInts.length);
                    tempCharInts[charInts.length - 1] = newCharInt;
                    charInts = tempCharInts;
                }
            }
        }

        for (CharInt charInt : charInts) {
            System.out.println("charInt = " + charInt);
        }
    }

    private void firstVariant(char[] chars) {
        List<CharInt> charInts = new ArrayList<>();

        for (char currentChar : chars) {
            if (charInts.isEmpty()) {
                CharInt newCharInt = new CharInt();
                newCharInt.letter = currentChar;
                newCharInt.count = 1;
                charInts.add(newCharInt);
            } else {
                boolean existChar = false;
                for (CharInt charInt : charInts) {
                    if (currentChar == charInt.letter) {
                        existChar = true;
                        charInt.count++;
                    }
                }
                if (!existChar) {
                    CharInt newCharInt = new CharInt();
                    newCharInt.letter = currentChar;
                    newCharInt.count = 1;
                    charInts.add(newCharInt);
                }
            }
        }

        Collections.sort(charInts);

        for (CharInt charInt : charInts) {
            System.out.println("charInt = " + charInt);
        }
    }
}
