package main.L.before;

/**
 * ReadOnlyDocument
 */
public class ReadOnlyDocument extends Document{

    @Override
    public void save() throws Exception {
        throw new Exception("Cant' save read-only document.");
    }
}
