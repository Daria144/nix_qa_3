package ua.com.alevel.task2;

public class CharInt implements Comparable<CharInt> {

    char letter = ' ';
    int count = 0;

    @Override
    public String toString() {
        return "CharInt{" +
                "letter=" + letter +
                ", count=" + count +
                '}';
    }

    @Override
    public int compareTo(CharInt o) {
        return Integer.compare(count, o.count);
    }
}
