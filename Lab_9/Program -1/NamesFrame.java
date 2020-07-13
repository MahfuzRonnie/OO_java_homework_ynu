import javax.swing.*;
import java.awt.*;

class NamesFrame extends JFrame {
    public NamesFrame() {
        setTitle("DrawNamesTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        NamesPanel panel = new NamesPanel();
        Container contentPane = getContentPane();
        contentPane.add(panel);
    }

    public static final int DEFAULT_WIDTH = 500;
    public static final int DEFAULT_HEIGHT = 500;
}