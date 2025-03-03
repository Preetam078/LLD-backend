package abstract_pattern.factories;
import abstract_pattern.buttons.Button;
import abstract_pattern.buttons.MacOSButton;
import abstract_pattern.checkbox.Checkbox;
import abstract_pattern.checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }    

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
    
}
