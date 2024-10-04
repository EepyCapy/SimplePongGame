import java.awt.Color;
import java.util.Random;

public class Main {
    static Loop mainGameLoop;
    static int playerWidth = 100;
    static int playerHeight = 20;
    static int boxDimension = 50;

    public static void main(String[] args) {
        Window window = new Window();
        Random rand = new Random();

        RectangleObject player = new RectangleObject(window.getWidth() / 2 - playerWidth / 2,  window.getHeight() - playerHeight - 40, playerWidth, playerHeight, Color.MAGENTA); //window.getHeight() - playerHeight
        RectangleObject box = new RectangleObject(rand.nextInt(window.getWidth() - boxDimension), 0, boxDimension, boxDimension, Color.CYAN);
        window.mainPanel.add(player.panel);
        window.mainPanel.add(box.panel);

        mainGameLoop = new Loop(window, player, box);
    }
}