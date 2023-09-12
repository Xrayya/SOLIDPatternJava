package main.L.before;

import java.util.LinkedList;

/**
 * Project
 */
public class Project {

    private LinkedList<Document> documents = new LinkedList<>();

    public LinkedList<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(LinkedList<Document> documents) {
        this.documents = documents;
    }

    public void openAll() {
        for (Document document : documents) {
            document.open();
        }
    }

    public void saveAll() {
        for (Document document : documents) {
            if (!(document instanceof ReadOnlyDocument)) {
                document.save();
            }
        }
    }
}
