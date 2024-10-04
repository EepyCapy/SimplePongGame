import javax.swing.Timer;

import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Loop implements ActionListener {
    Timer timer;
    Window window;
    RectangleObject player;
    RectangleObject box;
    int dx;
    int dy;
    int points;

    Loop(Window window, RectangleObject player, RectangleObject box) {
        this.window = window;
        this.player = player;
        this.box = box;
        this.dx = 4;
        this.dy = 5;
        this.points = 0;

        this.timer = new Timer(10, this);
        this.timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.player.x = (int) MouseInfo.getPointerInfo().getLocation().getX() - this.window.getX() - this.player.width / 2;
        this.box.x += dx;
        this.box.y += dy;
        this.player.panel.setBounds(this.player);
        this.box.panel.setBounds(this.box);
        this.boxCollisions();
        this.window.mainPanel.repaint();
    }

    void boxCollisions() {
        if (this.player.intersects(this.box)) {
            points += 1;
            dy += 1;
            this.dy = this.dy * -1;
        }
        if (this.box.y <= 0) {
            this.dy = this.dy * -1;
        } 
        if (this.box.x + this.box.getWidth() >= this.window.mainPanel.getWidth() || this.box.x <= 0) {
            this.dx = this.dx * -1;
        } 
        if (this.box.y + this.box.getHeight() >= this.window.mainPanel.getHeight()) {
            this.dy = this.dy * -1;
        } 
        if (this.box.y + this.box.getHeight() >= this.window.mainPanel.getHeight()) {
            System.out.println("Game Over");
            System.out.println(points);
        }
    }
}
