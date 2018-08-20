import java.awt.Color;

public class TurtleDemo
{
    public static void makeAwesomeTurtlePattern()
    {
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        crush.setPenColor(Color.RED);
        crush.penDown();
        int distance = 0;
        for (int i = 0; i < 200; i++)
            {
                crush.forward(distance);
                crush.turnRight();
                distance += 2;
                
            }
        Turtle layla = new Turtle(ocean);
        layla.setPenColor(Color.GREEN);
        layla.penDown();
        
        int dist = 0;
        for (int j = 0; j < 200; j++)
            {
                layla.forward(dist);
                layla.turn(85.0);
                dist += 2;
                
            }
    }
}
