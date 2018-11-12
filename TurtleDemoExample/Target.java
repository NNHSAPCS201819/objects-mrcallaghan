import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
   Draws a target.
*/
public class Target
{
   private double radius;
   private double xCenter;
   private double yCenter;

   /**
      Creates a new instance of Target.
      @param r the radius
      @param x the center x-coordinate
      @param y the center y-coordinate
    */
   public Target(double r, double x, double y)
   {
      radius = r;
      xCenter = x;
      yCenter = y;
   }

   /**
      Draws the target.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
      Ellipse2D.Double circle;
      double left = xCenter - radius;
      double top = yCenter - radius;

      circle = new Ellipse2D.Double(left, top, 2 * radius, 2 * radius);
      g2.setColor(Color.black);
      g2.fill(circle);

      radius = radius - 20;
      circle = new Ellipse2D.Double(left, top, 2 * radius, 2 * radius);
      g2.setColor(Color.white);
      g2.fill(circle);

      radius = radius - 20;
      circle = new Ellipse2D.Double(left, top, 2 * radius, 2 * radius);
      g2.setColor(Color.black);
      g2.fill(circle);

      radius = radius - 20;
      circle = new Ellipse2D.Double(left, top, 2 * radius, 2 * radius);
      g2.setColor(Color.white);
      g2.fill(circle);

      radius = radius - 20;
      circle = new Ellipse2D.Double(left, top, 2 * radius, 2 * radius);
      g2.setColor(Color.black);
      g2.fill(circle);
   }
}

