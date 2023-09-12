package main.L.after;

import java.io.FileWriter;

/**
 * ReadOnlyDocument
 */
public class WritableDocument extends Document {

    public void save() {
        try {
            FileWriter myWriter = new FileWriter(this.getFullPathFileName());
            myWriter.write(this.getData());
            myWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
