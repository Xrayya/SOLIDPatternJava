package main.L.after;

import java.util.LinkedList;

/**
 * Project
 */
public class Project {

    private LinkedList<Document> allDocs = new LinkedList<>();
    private LinkedList<WritableDocument> writableDocs = new LinkedList<>();

    public LinkedList<Document> getAllDocs() {
        return allDocs;
    }

    public void setAllDocs(LinkedList<Document> documents) {
        this.allDocs = documents;
    }

    public void openAll() {
        for (Document document : allDocs) {
            document.open();
        }
    }

    public void saveAll() {
        for (WritableDocument document : writableDocs) {
            document.save();
        }
    }
}
