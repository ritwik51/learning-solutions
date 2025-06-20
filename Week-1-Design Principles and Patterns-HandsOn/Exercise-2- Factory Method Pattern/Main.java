import documents.Document;
import factories.DocumnetFactory;
import factories.WordDocumnetFactory;
import factories.PdfDocumnetFactory;
import factories.ExcelDocumnetFactory;

public class Main {
	public static void main(String[] args) {
		DocumentFactory wordFactory = new WordDocumentFactory();
		Document word = wordFactory.createDocumnet();
		word.open();
		
		DocumentFactory pdfFactory = new PdfDocumentFactory();
		Document pdf = pdfFactory.createDocument();
		pdf.open();
		
		DocumentFactory excelFactory = new ExcelDocumentFactory();
		Document excel = excelFactory.createDocument();
		excel.open();
	}
}