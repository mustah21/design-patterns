import java.util.HashMap;

public class Library {

    private HashMap<Integer, DocumentInterface> storedDocuments;

    public Library() {
        this.storedDocuments = new HashMap<>();
    }

    public void addDocument(int identifier, DocumentInterface document) {
        storedDocuments.put(identifier, document);
    }
    public DocumentInterface getDocument(int identifier) {
        return storedDocuments.get(identifier);
    }

}
