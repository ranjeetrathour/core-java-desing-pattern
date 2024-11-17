package structural.bridge;

public class EmailNotification extends Notification{

    public EmailNotification(NotificationSender notificationSender) {
        super(notificationSender);
    }

    @Override
    public void send(String message) {
        System.out.println("email notification is sending.......");
        notificationSender.sendMessage(message);
    }
}
