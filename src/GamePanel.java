import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    Unit unitA;
    Unit unitB;

    GamePanel() {
    unitA = new Unit(0, 0);
     unitB = new Unit(2, 1);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
       g.setColor(Color.BLACK);
       // g.fillRect(50,50,50,50);
       
     int tilesizeX = 50;
     int tilesizeY = 50;
     int tilecorX = 50;
     int tilecorY = 50;
     int grid = 5;
     int gap = 2;


     for (int i = 0; i < grid; i++) {
       int  xs = tilecorX + i * tilesizeX;
       
        for (int j = 0; j< grid; j++ ) {
            int ys = tilecorY + j * tilesizeY;
          g.fillRect(xs, ys, tilesizeX -gap, tilesizeY- gap);
            
        }
     }

    g.setColor(Color.BLUE);
     int pixelX = tilecorX + unitA.gridX * tilesizeX;
     int pixelY = tilecorY + unitA.gridY * tilesizeY;
      g.fillRect(pixelX, pixelY, tilesizeX - gap, tilesizeY - gap);
    
  g.setColor(Color.RED);
     pixelX = tilecorX + unitB.gridX * tilesizeX;
     pixelY = tilecorY + unitB.gridY * tilesizeY;
g.fillRect(pixelX, pixelY, tilesizeX - gap, tilesizeY - gap);



 
  


        
}
}