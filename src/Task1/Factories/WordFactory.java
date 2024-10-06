package Task1.Factories;

import Task1.Document.WordDocument;
import Task1.Factories.DocumentFactory;
import Task1.Interfaces.Document;

public class WordFactory extends DocumentFactory {
    @Override
    public Document createDocument(){
        return new WordDocument();
    }
}
