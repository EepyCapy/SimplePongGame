import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class RectangleObject extends Rectangle {
    Color colour;
    ImageIcon icon;
    JPanel panel;

    RectangleObject(int x, int y, int width, int height, Color colour) {
        super(x, y, width, height);
        this.colour = colour;
        this.icon = null;
        this.panel = new JPanel();
        this.panel.setBounds(this.getBounds());
        this.panel.setBackground(this.colour);
    }

    void setIcon(String filepath) {
        this.icon = new ImageIcon(filepath);
    }


}

