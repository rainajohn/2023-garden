import ecs100.*;
import java.awt.Color;
import javax.swing.JColorChooser;
/**
 * Driver class for the flower support class
 *
 * @Raina
 * @13/3/23
 */
public class Garden
{
    Flower f1 = new Flower(50, 100, 20, 50, Color.pink);
    Flower f2 = new Flower(100, 100, 30, 50, Color.yellow);
    Flower f3 = new Flower(150, 100, 10, 50, Color.blue);

    /**
     * Constructor for obects if class garden
     */
    public Garden() {
        UI.initialise();
        UI.addButton("Quit", UI::quit);
        f1.draw();
        f2.draw();
        f3.draw();
        f1.grow();
        f3.grow();
        f2.grow();
        f1.grow();
        f3.grow();
    }

    public static void main(String[] args) {
        Garden obj = new Garden();
    }

}
