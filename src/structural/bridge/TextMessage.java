package structural.bridge;

public class TextMessage implements NotificationSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("plain message send "+message);
    }
}
