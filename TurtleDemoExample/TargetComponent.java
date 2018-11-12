import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JComponent;

/**
   This component draws a target.
*/
public class TargetComponent extends JComponent
{
   /**
      Paints the ellipse.
      @param g the graphics context
   */
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;

      Target target = new Target(Math.min(getWidth(), getHeight()) / 2,
         getWidth() / 2, getHeight() / 2);
      target.draw(g2);
   }
}
