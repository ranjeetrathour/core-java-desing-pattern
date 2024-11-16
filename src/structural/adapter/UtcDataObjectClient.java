package structural.adapter;

public class UtcDataObjectClient implements DataObjectDateAndTime {

   private final DataObjectProvider dataObjectProvider;

    public UtcDataObjectClient(DataObjectProvider dataObjectProvider) {
        this.dataObjectProvider = dataObjectProvider;
    }

    @Override
    public DataObject getData() {
        return dataObjectProvider.dataObject();
    }
}
