import javax.swing.*;
public class MainGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        GamePanel panel = new GamePanel();
        frame.add(panel);

        frame.setVisible(true);
    }
}