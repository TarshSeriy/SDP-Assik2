package Task2.Theme.Factories;

import Task2.Interfaces.Button;
import Task2.Interfaces.Checkbox;
import Task2.Interfaces.ThemeFactory;
import Task2.Theme.Light.LightButton;
import Task2.Theme.Light.LightCheckbox;

public class LightThemeFactory implements ThemeFactory {
    @Override
    public Button createButton(){
        return new LightButton();
    }
    @Override
    public Checkbox createCheckbox(){
        return new LightCheckbox();
    }
}
