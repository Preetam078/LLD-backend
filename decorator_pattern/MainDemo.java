package decorator_pattern;

import decorator_pattern.notification.EmailNotifier;
import decorator_pattern.notification.FacebookNotification;
import decorator_pattern.notification.Notifier;
import decorator_pattern.notification.SmsNotifier;

public class MainDemo {
    public static void main(String[] args) {
         Notifier notifier = new SmsNotifier();
        notifier.send();

        System.out.println("\nAdding Email Feature:");
        notifier = new EmailNotifier(notifier);
        notifier.send();

        System.out.println("\nAdding Facebook Notification Feature:");
        notifier = new FacebookNotification(notifier);
        notifier.send();
    }
}
