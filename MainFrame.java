import java.awt.*;
import javax.swing.*;

public class MainFrame implements Runnable{

    private PostUploadPage postUpload;

    public void run() {
        JFrame frame = new JFrame("Image Upload!");
        JPanel content = (JPanel) frame.getContentPane();
        content.setLayout(new BorderLayout());
        postUpload = new PostUploadPage();
        JPanel captionPanel = new JPanel();
        JLabel captionLabel = new JLabel("Caption");
        JTextField captionField = new JTextField(10);


    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new MainFrame());
    }
}