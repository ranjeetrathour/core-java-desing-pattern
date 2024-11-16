package structural.adapter;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class IstDataObjectClient implements DataObjectDateAndTime {

    private final DataObjectProvider dataObjectProvider;

    public IstDataObjectClient(DataObjectProvider dataObjectProvider) {
        this.dataObjectProvider = dataObjectProvider;
    }

    @Override
    public DataObject getData() {
        DataObject object = dataObjectProvider.dataObject();

        //convert utc to ist
        ZonedDateTime utcTime = object.getUtcTimeAndDate().atZone(ZoneId.of("UTC"));
        ZonedDateTime istTime = utcTime.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));

        return new DataObject(
                object.getName(),
                object.getDescription(),
                istTime.toLocalDateTime()
        );
    }
}
