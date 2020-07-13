import java.awt.*;
import javax.swing.*;

class ShapesFrame extends JFrame {
    public ShapesFrame() {
        setTitle("DrawTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        ShapesPanel panel = new ShapesPanel();
        Container contentPane = getContentPane();
        contentPane.add(panel);
    }
    public static final int DEFAULT_WIDTH=500;
    public static final int DEFAULT_HEIGHT=500;
}
