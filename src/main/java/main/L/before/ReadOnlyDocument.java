package main.L.before;

/**
 * ReadOnlyDocument
 */
public class ReadOnlyDocument extends Document {

    @Override
    public void save() {
        try {
            throw new Exception("Can't save a read-only document");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
