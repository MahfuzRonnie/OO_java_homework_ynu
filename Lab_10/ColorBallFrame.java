import java.awt.*;
import javax.swing.*;

class ColorBallFrame extends JFrame {
    public ColorBallFrame() {
        setTitle("ChangeBallColor");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        ColorBallPanel panel = new ColorBallPanel();
        Container contentPane = getContentPane();
        contentPane.add(panel);
    }
    public static final int DEFAULT_WIDTH=500;
    public static final int DEFAULT_HEIGHT=500;
}
