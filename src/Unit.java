import java.awt.Graphics;
import java.awt.Color;

public class Unit  {
    int gridX;
    int gridY;
    Color color;

    public Unit(int gridX, int gridY, Color color) {
        this.gridX = gridX;
        this.gridY = gridY;
        this.color = color;
    }

    public void draw(Graphics g, int xOffset, int yOffset, int dimension, int gap) {
        int pixelx = xOffset +gridX * dimension;
        int pixely = yOffset + gridY * dimension;
        g.setColor(color);
        g.fillRect(pixelx, pixely, dimension-gap, dimension-gap);
    }
}