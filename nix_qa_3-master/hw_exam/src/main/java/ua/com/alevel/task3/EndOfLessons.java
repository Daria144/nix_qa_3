package ua.com.alevel.task3;

import java.io.BufferedReader;
import java.io.IOException;

public class EndOfLessons {

    public void run(BufferedReader reader) {
        System.out.println("Task3.run");
        System.out.println("Please, enter number of lessons");

        try {
            String numberOfLessonsString = reader.readLine();
            Integer numberOfLessons = Integer.parseInt(numberOfLessonsString);

            System.out.println("you enter a " + numberOfLessons + " lessons");

            // todo

            System.out.println("11 35");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
