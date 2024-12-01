import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class PostUploadPage extends JComponent implements Runnable{

    public PostUploadPage() {

    }

    public void run() {
        JFrame frame = new JFrame("Image Upload!");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);


        JPanel content = (JPanel) frame.getContentPane();
        content.setLayout(new BorderLayout());

        // Upload Image Panel
        JPanel imagePanel = new JPanel();
        imagePanel.setBorder(new EmptyBorder(10, 5, 10, 5));
        imagePanel.setBorder(BorderFactory.createLineBorder(Color.black));

        JButton uploadButton = new JButton("Upload Photo!");
        uploadButton.setPreferredSize(new Dimension(120, 50));
        imagePanel.add(uploadButton, BorderLayout.NORTH);
        content.add(imagePanel, BorderLayout.NORTH);
        
        // Caption panel
        JPanel captionPanel = new JPanel();
        captionPanel.setLayout(new BorderLayout());
        captionPanel.setBorder(new EmptyBorder(10, 5, 10, 5) );
        captionPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        captionPanel.setPreferredSize(new Dimension(100, 50));

        JLabel captionLabel = new JLabel("Caption:");
        JTextField captionField = new JTextField(40);
        captionLabel.setPreferredSize(new Dimension(100, 50));
        captionField.setPreferredSize(new Dimension(100, 40));
        captionPanel.add(captionLabel, BorderLayout.WEST);
        captionPanel.add(captionField, BorderLayout.EAST);
        content.add(captionPanel, BorderLayout.CENTER);

        // Post Button
        JPanel postPanel = new JPanel();
        postPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        JButton postButton = new JButton("Post!");
        postPanel.add(postButton, BorderLayout.SOUTH);
        postButton.setPreferredSize(new Dimension(100, 50));
        content.add(postPanel, BorderLayout.SOUTH);


    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new PostUploadPage());
    }
}