
import Task1.Factories.DocumentFactory;
import Task1.Factories.PDFFactory;
import Task1.Factories.WordFactory;
import Task2.*;
import Task2.Interfaces.ThemeFactory;
import Task2.Theme.Factories.*;
public class Main {

    /**
     * Main class to test both Task 1 (Document Creation System) and Task 2 (Theme-based GUI System).
     * Task 1: Uses the Factory Method design pattern.
     * - Factory Method allows us to define an interface for creating an object.
     * -  follow the Open/Closed Principle (OCP) since we can add new document types (e.g., PDF, Word) without modifying the existing code.
     * - The Single Responsibility Principle (SRP) is also respected as each factory is responsible for the creation of a specific document type.
     * Task 2: Using the Abstract Factory design pattern.
     * - Abstract Factory allows the creation of families of related or dependent objects (e.g., Button and Checkbox) without specifying  concrete classes.
     * - This follows the Open/Closed Principle (OCP) since we can add new themes (e.g., LightTheme, DarkTheme) without modifying the existing code.
     * - The Dependency Inversion Principle (DIP) is followed as the application depends on abstractions (ThemeFactory, Button, Checkbox), not on concrete implementations.
     */
    public static void main(String[] args){
        System.out.println("Task1: Document Creation");

        DocumentFactory pdfFactory = new PDFFactory();
        pdfFactory.generateDocument();

        DocumentFactory wordFactory = new WordFactory();
        wordFactory.generateDocument();

        System.out.println("Task2: GUI ===");


        ThemeFactory lightThemeFactory = new LightThemeFactory();
        Application lightApp = new Application(lightThemeFactory);
        lightApp.displayElements();

        ThemeFactory darkThemeFactory = new DarkThemeFactory();
        Application darkApp = new Application(darkThemeFactory);
        darkApp.displayElements();

        // Design Patterns and SOLID principles:
        // - Abstract Factory Pattern
        // - Open/Closed Principle (OCP): We can easily add new themes (e.g., BlueTheme) without modifying the existing code.
        // - Dependency Inversion Principle (DIP): The application depends on abstractions (ThemeFactory, Button, Checkbox), not concrete classes.
    }
}
