import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

class ShapesPanel extends JPanel {
    Graphics2D g2;

    public ShapesPanel() {
        setBackground(Color.white);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g2 = (Graphics2D)g;

        g2.setPaint(Color.GREEN);
        Ellipse2D circle = new Ellipse2D.Double(500,500,250,250);
        g2.fill(circle);

        g2.setPaint(Color.BLACK);
        Line2D line = new Line2D.Double(100,100,1000,100);
        g2.draw(line);

        g2.setPaint(Color.ORANGE);
        Rectangle2D rect = new Rectangle2D.Double(300,300,200,400);
        g2.fill(rect);
    }
} 
