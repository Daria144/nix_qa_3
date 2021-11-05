package ua.com.alevel.data;

import java.util.Objects;

public class DataClass extends BaseClass {

    private Long f1;
    private Long f2;
    private Long f3;

    public void setF1(Long f1) {
        this.f1 = f1;
    }

    public void setF2(Long f2) {
        this.f2 = f2;
    }

    public void setF3(Long f3) {
        this.f3 = f3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataClass dataClass = (DataClass) o;
        return Objects.equals(super.getId(), dataClass.getId()) && Objects.equals(f1, dataClass.f1) && Objects.equals(f2, dataClass.f2) && Objects.equals(f3, dataClass.f3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getId(), f1, f2, f3);
    }
}
