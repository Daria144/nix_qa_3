package ua.com.alevel.enums;

import java.math.BigDecimal;
import java.util.Date;

public class Document {

    private String id;
    private Date created;
    private BigDecimal price;
    private DocumentStatus status;

    private static final String LOADED = "LOADED";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public DocumentStatus getStatus() {
        return status;
    }

    public void setStatus(DocumentStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id='" + id + '\'' +
                ", created=" + created +
                ", price=" + price +
                ", status=" + status +
                ", LOADED=" + LOADED +
                '}';
    }
}
