package Task3;

public interface IDocument {
    void save();

    void close();

    void open();

    String getContent();

    void setContent(String text);
}
