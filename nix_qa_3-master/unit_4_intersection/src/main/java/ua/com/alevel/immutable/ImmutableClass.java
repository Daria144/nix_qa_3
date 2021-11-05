package ua.com.alevel.immutable;

public class ImmutableClass {

    private final String login;
    private final String pass;

    public ImmutableClass(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }
}
