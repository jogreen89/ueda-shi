// EmptyFrameViewer.java
//
// This program displays an empty frame.
// 2016 (c) zubernetes
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
    This program displays an empty frame.
*/
public class FilledFrame extends JFrame {
    // Use instance variables for components
    private JButton button;
    private JLabel label;

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_LENGTH = 100;

    public FilledFrame() {
        // Now we can use a helper method
        createComponents();

        // It is a good idea to set the size in the
        // frame constructor
        setSize(FRAME_WIDTH, FRAME_LENGTH);
    }

    private void createComponents() {
        button = new JButton("Click me!");
        label = new JLabel("Hello, World!");

        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        add(panel);
    }
}
