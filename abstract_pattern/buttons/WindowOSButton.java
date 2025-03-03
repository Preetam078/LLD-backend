package abstract_pattern.buttons;

public class WindowOSButton implements Button {
    @Override 
    public void paint() {
        System.out.println("You have created WindowOSButton.");
    }
}
