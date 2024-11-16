package structural.adapter;


/**
 * The Adapter Design Pattern is used here to adapt a functionality where we need to convert the date and time
 * format for different countries without changing the original object.
 *
 * In this example, we have one data object that is sent to different countries. Some countries understand time in UTC
 * while others use IST. Instead of changing the original object, we create an adapter class to convert the time format.
 */
public class MainClient {
    public static void main(String[] args) {

        // Creating the DataObjectProvider instance that will provide the data
        DataObjectProvider dataObjectProvider = new DataObjectProvider();

        // Creating the UtcDataObjectClient which will return data in UTC format
        UtcDataObjectClient utcDataObjectClient  = new UtcDataObjectClient(dataObjectProvider);
        System.out.println("UTC Time: " + utcDataObjectClient.getData().getUtcTimeAndDate());

        // Creating the IstDataObjectClient which will convert UTC time to IST
        IstDataObjectClient istDataObjectClient = new IstDataObjectClient(dataObjectProvider);
        System.out.println("IST Time: " + istDataObjectClient.getData().getUtcTimeAndDate());
    }
}
