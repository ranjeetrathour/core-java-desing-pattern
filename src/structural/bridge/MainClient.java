package structural.bridge;

public class MainClient {
    public static void main(String[] args) {
        Notification sender = new EmailNotification(new BinaryMessage());
        sender.send("dfghjkl;");
    }
}
