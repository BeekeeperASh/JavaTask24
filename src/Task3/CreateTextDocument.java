package Task3;

public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        System.out.println("Creating a new Text Document");
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        System.out.println("Opening an existing Text Document");
        return new TextDocument();
    }
}
