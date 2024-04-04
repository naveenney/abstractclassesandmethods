package abstractclassesandabstractmethods.document;

public class Main {

	public static void main(String[] args) {
		PDFDocument pdfDocument = new PDFDocument("Java", "James Gostling");
		TextDocument textDocument = new TextDocument("Design Patterns", "Jane Smith");
		ImageDocument imageDocument = new ImageDocument("Landscape", "Michael Johnson");

		pdfDocument.open();
		pdfDocument.close();

		System.out.println();

		textDocument.open();
		textDocument.close();

		System.out.println();

		imageDocument.open();
		imageDocument.close();
	}
}