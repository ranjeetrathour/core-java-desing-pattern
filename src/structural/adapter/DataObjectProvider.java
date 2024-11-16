package structural.adapter;

import java.time.LocalDateTime;

public class DataObjectProvider {

    public DataObject dataObject(){
        return new DataObject("Test Name", "Test Description", LocalDateTime.now());
    }
}
