import java.util.Random;
import java.awt.Color;

/**
 * Write a description of class RandomRegularPolygon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomRegularPolygon
{
    /**
     * Complete the class on the next page to use a Random object to generate a random number
     * between 3 and 12 (inclusive). This random number will be the number of sides of a regular
     * polygon that will be drawn by a turtle. Use a Turtle object is draw this shape (the pen
     * color is pink, the pen width is its default size, the length of each side of the regular polygon
     * is 50 steps). The interior angle measurement of a regular polygon is given by the
     * expression 180 (n - 2) / n where n is the number of sides. The turtle should draw the first
     * side starting from its default position and orientation. Since we haven't studied loops, feel
     * free to simply bracket the code that should be executed repeatedly and comment how
     * many times it should loop.
     */
    public static void main( String[] args )
    {
        World world = new World();  
        Turtle crush = new Turtle(world);
        Random generator = new Random();
        int randNum = generator.nextInt(10) + 3;  // random number between 3-12
        System.out.println(randNum);
        crush.setPenColor(Color.PINK);
        crush.penDown();
        double turnAngle = 180 - (180 * (randNum - 2) / randNum);  // turtle turn in 180 - interior angle
        for (int i = 0; i < randNum; i++)  
        {
            crush.forward(50);
            crush.turn(turnAngle);
   
        }
        
    }
}
