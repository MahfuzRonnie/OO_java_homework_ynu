import javax.swing.*;
import java.awt.*;

class NamesPanel extends JPanel {

    public void paintComponent(Graphics g1) {
        super.paintComponent(g1);
        Graphics2D g2 = (Graphics2D)g1;

        g2.setPaint(Color.RED);

        String myName = "Mahfuz Rony";
        for(int i = 4; i < 25; i +=2)
        {
            Font myFont = new Font("TimesRoman", Font.BOLD, i);
            g2.setFont(myFont);
            g2.drawString(myName, 100, 10+i*10);
        }
    }

} 