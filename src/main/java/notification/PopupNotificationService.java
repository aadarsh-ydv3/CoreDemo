package notification;

public class PopupNotificationService implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("Pop-up notification send");
    }
}
