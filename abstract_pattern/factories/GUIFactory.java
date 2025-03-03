package abstract_pattern.factories;
import abstract_pattern.buttons.Button;
import abstract_pattern.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
