package decorator_pattern.notification;

import decorator_pattern.decorator.NotificationDecorator;

public class EmailNotifier extends NotificationDecorator {
    public EmailNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Sending Email Notification");
    }
}
