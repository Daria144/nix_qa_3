package ua.com.alevel.data;

public class User {

    private final String name;

    private String inn;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }
}
