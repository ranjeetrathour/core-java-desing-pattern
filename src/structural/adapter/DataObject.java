package structural.adapter;

import java.time.LocalDateTime;

public class DataObject {

    private String name;
    private String description;
    private LocalDateTime utcTimeAndDate;

    public DataObject() {
    }

    public DataObject(String name, String description, LocalDateTime utcTimeAndDate) {
        this.name = name;
        this.description = description;
        this.utcTimeAndDate = utcTimeAndDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getUtcTimeAndDate() {
        return utcTimeAndDate;
    }

    public void setUtcTimeAndDate(LocalDateTime utcTimeAndDate) {
        this.utcTimeAndDate = utcTimeAndDate;
    }
}
