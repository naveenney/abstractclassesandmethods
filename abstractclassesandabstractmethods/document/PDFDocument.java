package abstractclassesandabstractmethods.document;


public class PDFDocument extends Document {
    
    public PDFDocument(String title, String author) {
        super(title, author);
    }
    
    public void open() {
        System.out.println("Opening PDF document:"+ getTitle() + " by " + getAuthor());
   
    }

    public void close() {
        System.out.println("Closing PDF document:"+ getTitle() + " by " + getAuthor());
     
    }
}
