import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
       // g.setColor(Color.BLACK);
       // g.fillRect(50,50,50,50);
       
     int tilesizex = 50;
     int tilesizey = 50;
     int tilecorx = 50;
     int tilecory = 50;
     int grid = 5;
     int gap = 2;

     for (int i = 0; i < grid; i++) {
       int  xs = tilecorx + i * tilesizex;
       
        for (int j = 0; j< grid; j++ ) {
            int ys = tilecory + j * tilesizey;
          g.fillRect(xs, ys, tilesizex -gap, tilesizey- gap);
            
        }
     }

        
}
}