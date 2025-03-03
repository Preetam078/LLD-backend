package decorator_pattern.notification;

//Concrete class for SMS
public class SmsNotifier implements Notifier {

    @Override
    public void send() {
        System.out.print("Sending notification through SMS");
    }
}
