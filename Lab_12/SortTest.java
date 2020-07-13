import javax.swing.*;
import java.awt.*;

public class SortTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SortFrame frame = new SortFrame();
                frame.setLocation(350,180);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
