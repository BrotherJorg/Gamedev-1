import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;


public class GamePanel extends JPanel {

  ArrayList<Unit> units;

  public GamePanel(){
    units = new ArrayList<>();
    units.add(new Unit(0,0, Color.BLUE));f
    units.add(new Unit(1,1, Color.GREEN));
    units.add(new Unit(9,9, Color.YELLOW));
  }


  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
t
    
    int rows = 10;
    int cols = 10;
    int xOffset = 50;
    int yOffset = 50;
    int dimension = 25;
    int gap;
    gap = 3;
    

    g.setColor(Color.BLACK);
    for (int i = 0; i < rows; i++) {
       
      for (int j =0; j < cols; j++) {
       int  pixelx = xOffset + j * dimension;
       int pixely = yOffset + i * dimension;
       g.fillRect(pixelx, pixely, dimension-gap, dimension-gap);
      }
    }

    for (int i = 0; i < units.size(); i ++) {
      Unit unit = units.get(i);
      unit.draw(g, xOffset, yOffset, dimension, gap);
    }
    
  }

}