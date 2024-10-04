import javax.swing.JFrame;


public class Window extends JFrame {
    Panel mainPanel;

    Window() {
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("PONG");
        //this.setSize(600, 800);
        this.setVisible(true);

        mainPanel = new Panel();
        this.add(mainPanel);
        this.pack();

        this.setLocationRelativeTo(null);
    }
}
