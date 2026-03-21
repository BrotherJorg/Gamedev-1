import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.event.*;
import java.awt.event.KeyEvent;


public class GamePanel extends JPanel implements KeyListener {

  Unit player;

  public void testMove(){
    units.get(0).moveRight();
      System.out.println("moving...");
    repaint();
  }

  ArrayList<Unit> units;

  public GamePanel(){
    units = new ArrayList<>();
    units.add(new Unit(0,0, Color.BLUE));
    units.add(new Unit(1,1, Color.GREEN));
    units.add(new Unit(9,9, Color.YELLOW));
    units.add(new Unit(9,2, Color.RED));

      // eyListener
    setFocusable(true);
    requestFocusInWindow();
    addKeyListener(this);

      // player
    player = units.get(0);
  }
  
 

  @Override
  public void keyPressed(KeyEvent e) {
    int key = e.getKeyCode();

    switch (key) {
      case KeyEvent.VK_UP:
          player.moveUp(); break;
      case KeyEvent.VK_DOWN:
          player.moveDown(); break;
      case KeyEvent.VK_LEFT:
          player.moveLeft(); break;
      case KeyEvent.VK_RIGHT: 
          player.moveRight(); break;
    }
    repaint();
  }

  @Override
  public void keyReleased(KeyEvent e) {}

  @Override
  public void keyTyped(KeyEvent e) {}



  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    
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