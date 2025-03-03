package decorator_pattern.decorator;

import decorator_pattern.notification.Notifier;

public class NotificationDecorator implements Notifier {
    protected Notifier notifier;

    public NotificationDecorator(Notifier notifier) {   
        this.notifier = notifier;
    }

    @Override
    public void send() {
        notifier.send();
    }
}
