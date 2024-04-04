package abstractclassesandabstractmethods.document;

public class TextDocument extends Document {

	public TextDocument(String title, String author) {
		super(title, author);
	}

	public void open() {
		System.out.println("Opening Text document:" + getTitle() + "by" + getAuthor());
	}

	public void close() {
		System.out.println("Closing Text document:" + getTitle() + "by" + getAuthor());

	}
}