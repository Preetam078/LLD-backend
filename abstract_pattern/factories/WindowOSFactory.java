package abstract_pattern.factories;
import abstract_pattern.buttons.Button;
import abstract_pattern.buttons.WindowOSButton;
import abstract_pattern.checkbox.Checkbox;
import abstract_pattern.checkbox.WindowOSCheckbox;

public class WindowOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowOSButton();
    }                

    @Override
    public Checkbox createCheckbox() {
        return new WindowOSCheckbox();
    }   
    
}
