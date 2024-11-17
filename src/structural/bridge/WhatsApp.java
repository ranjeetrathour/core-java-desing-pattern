package structural.bridge;

public class WhatsApp extends Notification{
    public WhatsApp(NotificationSender notificationSender) {
        super(notificationSender);
    }

    @Override
    public void send(String message) {
        System.out.println("whats app message sending..........");
        notificationSender.sendMessage(message);
    }
}
