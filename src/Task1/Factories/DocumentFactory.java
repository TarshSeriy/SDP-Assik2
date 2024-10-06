package Task1.Factories;

import Task1.Interfaces.Document;

public abstract class DocumentFactory {
    public abstract Document createDocument();
    public void generateDocument(){
        Document document = createDocument();
        document.create();
    }
}
