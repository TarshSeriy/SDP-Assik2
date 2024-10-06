package Task1.Document;

import Task1.Interfaces.Document;

public class WordDocument implements Document {
    @Override
    public void create(){
        System.out.println("Word created");
    }
}
