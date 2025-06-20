package factories;

import documents.Document;
import documents.WordDocument;

public class WordDocumnetFactory extends DocumentFactory {
	@Override
	public Documnet createDocument() {
		return new WordDocument();
	}
}
 