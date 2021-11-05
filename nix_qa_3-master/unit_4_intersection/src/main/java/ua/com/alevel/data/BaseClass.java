package ua.com.alevel.data;

public abstract class BaseClass {

    private Long id;

    public void setId(Long id) {
        if (id >= 0) {
            this.id = id;
        }
    }

    public Long getId() {
        return id;
    }
}
