import ecs100.*;
import java.awt.Color;
import javax.swing.JColorChooser;
/**
 * Flower support class
 * Creates a flower of a size and colour
 * It can grow
 * It can tell the driver class where it is on the screen
 *
 * @Raina
 * @14/3/23
 */
public class Flower
{
    // instance variables
    private double flowerX;  // x pos of the flower 
    private double flowerY;  // y pos of the flower

    private int flowerSize;         // flower size
    private int flowerHeight;       // flower height

    private double left;            // left of flower
    private double top;             // top of flower
    private double bottom;          // bottom of flower

    private Color color;            // Colour of flower

    /**
     * Constructor for objects of class Flower
     */
    public Flower(double x, double y, int size, int stem, Color col)
    {
        // initialise instance variables
        flowerX = x;
        flowerY = y;
        flowerSize = size;
        flowerHeight = stem;
        color = col;

        // set the top, left, bottom
        setTop();
        setLeft();
        setBottom();
    }
    
    /**
     * Getter left
     */
    public double getLeft(){
        return this.left;
    }
    
    /**
     * Getter right
     */
    public double getRight(){
        return this.left + this.flowerSize;
    }
    
    /**
     * Getter top
     */
    public double getTop(){
        return this.top;
    }
    
    /**
     * Getter bottom
     */
    public double getBottom(){
        return this.bottom;
    }

    /**
     * set left
     */
    public void setLeft() {
        this.left = this.flowerX - this.flowerSize/2.0;
    }

    /**
     * set top
     */
    public void setTop() {
        this.top = this.flowerY - this.flowerSize/2.0;
    }

    /**
     * set bottom
     */
    public void setBottom() {
        this.bottom = this.flowerY + this.flowerHeight;
    }

    /**
     * Draw flower in the canvas
     */
    public void draw() {
        final int STEMWIDTH = 2;
        // draw stem
        UI.setColor(Color.green);      // set color of stem
        UI.setLineWidth(STEMWIDTH);    // set width of stem
        UI.drawLine(flowerX, flowerY, flowerX, bottom);    // draw in stem

        // draw flower
        UI.setColor(this.color);                 // set colour of flower
        UI.fillOval(left, top, flowerSize, flowerSize);    // draw the flower
        UI.sleep(500);    // pause between each flower 
    }

    /**
     * Erase a rectangle around the current instance
     */
    public void erase(){
        UI.eraseRect(left, top, flowerSize+1, bottom+1);
    }

    /**
     * Make the flower grow
     */
    public void grow() {
        this.erase(); //  erase the flower
        this.flowerY -=10; 
        this.flowerSize += 10; //increase the size of the bulb 

        // set the new position
        this.setTop();
        this.setLeft();
        this.draw();   // redraw the flower
    }
}
