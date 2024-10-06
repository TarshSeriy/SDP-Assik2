package Task1.Document;

import Task1.Interfaces.Document;

public class PDFDocument implements Document {
    @Override
    public void create(){
        System.out.println("PDF created");
    }

}
