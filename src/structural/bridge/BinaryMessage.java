package structural.bridge;

public class BinaryMessage implements NotificationSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("binary message send "+message);
    }
}
