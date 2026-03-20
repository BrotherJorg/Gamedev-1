import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;


public class GamePanel extends JPanel {
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.setColor(Color.BLACK);
    int rows = 5;
    int cols = 5;
    int xOffset = 0;
    int yOffset = 0;
    int dimension = 25;
   
    for (int i = 0; i < rows; i++) {
       int gap = 3;
      for (int j =0; j < cols; j++) {
       int  pixelx = xOffset + j * dimension;
       int pixely = yOffset + i * dimension;
       g.fillRect(pixelx, pixely, dimension-gap, dimension-gap);
      }
    }
    
  }

}