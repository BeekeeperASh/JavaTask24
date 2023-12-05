package Task3;// TextDocument.java
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.*;

public class TextDocument implements IDocument {
    private String content;

    public TextDocument() {
        this.content = "";
    }

    @Override
    public void save() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileChooser.getSelectedFile()))) {
                writer.write(content);
                JOptionPane.showMessageDialog(null, "Text Document saved successfully!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error saving Text Document: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void close() {
        System.out.println("Text Document closed");
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void open() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()))) {
                StringBuilder text = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    text.append(line).append("\n");
                }
                content = text.toString();
                JOptionPane.showMessageDialog(null, "Text Document opened successfully!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error opening Text Document: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
