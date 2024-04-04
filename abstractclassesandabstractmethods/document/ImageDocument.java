package abstractclassesandabstractmethods.document;


public class ImageDocument extends Document {
 
    public ImageDocument(String title, String author) {
        super(title, author);
    }
    public void open() {
        System.out.println("Opening Image document: " + getTitle() + " by " + getAuthor());
    }

    public void close() {
        System.out.println("Closing Image document: " + getTitle() + " by " + getAuthor());
    }
}
