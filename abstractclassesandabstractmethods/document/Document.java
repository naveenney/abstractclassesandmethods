package abstractclassesandabstractmethods.document;

abstract class Document {
    private String title;
    private String author;
    
    public Document(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public abstract void open();

    public abstract void close();

    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
}