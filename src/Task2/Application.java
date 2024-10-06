package Task2;

import Task2.Interfaces.Button;
import Task2.Interfaces.Checkbox;
import Task2.Interfaces.ThemeFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;


    public Application(ThemeFactory themeFactory) {
        this.button = themeFactory.createButton();
        this.checkbox = themeFactory.createCheckbox();
    }

    public void displayElements() {
        button.display();
        checkbox.display();
    }
}

