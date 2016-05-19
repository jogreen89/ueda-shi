// EmptyFrameViewer.java
//
// This program displays an empty frame.
// 2016 (c) zubernetes
import javax.swing.JFrame;
/**
    This program displays an empty frame.
*/
public class EmptyFrameViewer {
    static final int FRAME_WIDTH = 400;
    static final int FRAME_HEIGHT = 400;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("An empty frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

    }
}
