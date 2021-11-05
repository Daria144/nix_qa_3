package ua.com.alevel.enums;

public enum InnerEnum {

    LOADED("Loaded", 1),
    VALIDATED("Validated", 2),
    REJECTED("Rejected", 3),
    SUCCEED("Succeed", 4);

    private final String viewName;
    private final int id;

    InnerEnum(String viewName, int id) {
        this.viewName = viewName;
        this.id = id;
    }

    public String getViewName() {
        return viewName;
    }

    public int getId() {
        return id;
    }
}
