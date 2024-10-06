package Task1.Factories;

import Task1.Document.PDFDocument;
import Task1.Factories.DocumentFactory;
import Task1.Interfaces.Document;

public class PDFFactory extends DocumentFactory {
    @Override
    public Document createDocument(){
        return new PDFDocument();
    }
}
