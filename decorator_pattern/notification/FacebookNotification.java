package decorator_pattern.notification;

import decorator_pattern.decorator.NotificationDecorator;

public class FacebookNotification extends NotificationDecorator {
    public FacebookNotification(Notifier notifier) {
        super(notifier);
    }
    
    @Override
    public void send() {
        super.send();
        System.out.println("Sending Email Notification");
    }
}
