package abstractclassesandabstractmethods.book;

public class Book {

	String title;
	
	String author;
	
	int availableBook;
	
	int pubYear;

	public Book(String title, String author, int availableBook, int pubYear) {
		this.title = title;
		this.author = author;
		this.availableBook = availableBook;
		this.pubYear = pubYear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getAvailableBook() {
		return availableBook;
	}

	public void setAvailableBook(int availableBook) {
		this.availableBook = availableBook;
	}

	public int getPubYear() {
		return pubYear;
	}

	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;
	}
	
	public void updateBooks(int availableCount)
	{
		setAvailableBook(availableCount);
	}
	
}
