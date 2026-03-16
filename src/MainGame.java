import javax.swing.*;
import java.awt.*;

public class MainGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gamedev1");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(640, 480);

        GamePanel panel = new GamePanel();
        
        frame.add(panel);
        frame.setVisible(true);
    }
}