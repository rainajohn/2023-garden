import ecs100.*;
import java.awt.Color;
import javax.swing.JColorChooser;
/**
 * Create a garden with each garden obj in a array
 * Click on the flower and make it grow
 *
 * @Raina
 * @14/3/23
 */
public class ClickGarden
{
    // Class constants
    private static final int STARTX = 75;
    private static final int YPOS = 100;
    private static final int MAXFLOWERS = 5;

    // Make an arrary of flowers
    private Flower[] flowerBed = new Flower[MAXFLOWERS];  // initialise array

    /**
     * Constructor for objects of class ClickGarden
     */
    public ClickGarden() {
        // initialise instance variables
        UI.initialise();
        UI.addButton("Quit", UI::quit);

        // Setup the flowers
        for (int i = 0; i < MAXFLOWERS; i++) {
            // set every flower to a random colour
            Color col = new Color((float)Math.random(), (float)Math.random(),(float)Math.random());
            flowerBed[i] = new Flower(STARTX * (i+1), YPOS, 10, 50, col); // create the flower objs in the array
        }

        // Draw each flower
        for (Flower flower : flowerBed) {
            flower.draw();
        }
    }

}
