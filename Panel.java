import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;

public class Panel extends JPanel {
    Panel() {
        super();
        this.setPreferredSize(new Dimension(600, 800));
        this.setLayout(null);
        this.setBackground(new Color(0x121212));
    }
}
