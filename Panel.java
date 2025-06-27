package Locomotora;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.Rectangle2D.Double;
import javax.swing.JPanel;

public class Panel extends JPanel {
   public void paint(Graphics g) {
      Graphics2D g2 = (Graphics2D)g;
      Rectangle2D base = new Double(74.0D, 250.0D, 221.0D, 25.0D);
      g2.draw(base);
      RoundRectangle2D cal1 = new java.awt.geom.RoundRectangle2D.Double(170.0D, 140.0D, 25.0D, 103.0D, 20.0D, 20.0D);
      RoundRectangle2D cal2 = new java.awt.geom.RoundRectangle2D.Double(199.0D, 140.0D, 25.0D, 103.0D, 20.0D, 20.0D);
      RoundRectangle2D cal3 = new java.awt.geom.RoundRectangle2D.Double(228.0D, 140.0D, 25.0D, 103.0D, 20.0D, 20.0D);
      RoundRectangle2D cal4 = new java.awt.geom.RoundRectangle2D.Double(257.0D, 140.0D, 25.0D, 103.0D, 20.0D, 20.0D);
      RoundRectangle2D cal5 = new java.awt.geom.RoundRectangle2D.Double(286.0D, 140.0D, 25.0D, 103.0D, 20.0D, 20.0D);
      g2.draw(cal1);
      g2.draw(cal2);
      g2.draw(cal3);
      g2.draw(cal4);
      g2.draw(cal5);
      Rectangle2D ch = new Double(289.0D, 105.0D, 19.0D, 43.0D);
      g2.draw(ch);
      int[] puntosXi = new int[]{311, 322, 311, 286, 275, 286};
      int[] puntosYi = new int[]{65, 85, 105, 105, 85, 65};
      Polygon poly1 = new Polygon(puntosXi, puntosYi, 6);
      g2.drawPolygon(poly1);
      Rectangle2D fr = new Double(314.0D, 170.0D, 10.0D, 40.0D);
      g2.draw(fr);
      int[] puntosX2 = new int[]{314, 350, 297, 297};
      int[] puntosY2 = new int[]{235, 287, 287, 235};
      Polygon poly2 = new Polygon(puntosX2, puntosY2, 4);
      g2.drawPolygon(poly2);
      Rectangle2D cab = new Double(90.0D, 174.0D, 77.0D, 35.0D);
      g2.draw(cab);
      Rectangle2D at = new Double(76.0D, 170.0D, 10.0D, 40.0D);
      g2.draw(at);
      Rectangle2D tec = new Double(87.0D, 70.0D, 80.0D, 30.0D);
      g2.draw(tec);
      Line2D l1 = new java.awt.geom.Line2D.Double(95.0D, 100.0D, 120.0D, 174.0D);
      Line2D l2 = new java.awt.geom.Line2D.Double(160.0D, 100.0D, 160.0D, 174.0D);
      Line2D l3 = new java.awt.geom.Line2D.Double(90.0D, 210.0D, 107.0D, 240.0D);
      Line2D l4 = new java.awt.geom.Line2D.Double(107.0D, 240.0D, 167.0D, 240.0D);
      Line2D l5 = new java.awt.geom.Line2D.Double(167.0D, 210.0D, 167.0D, 240.0D);
      Ellipse2D r1 = new java.awt.geom.Ellipse2D.Double(90.0D, 223.0D, 80.0D, 80.0D);
      Ellipse2D r2 = new java.awt.geom.Ellipse2D.Double(120.0D, 253.0D, 20.0D, 20.0D);
      Ellipse2D r3 = new java.awt.geom.Ellipse2D.Double(212.0D, 223.0D, 80.0D, 80.0D);
      Ellipse2D r4 = new java.awt.geom.Ellipse2D.Double(242.0D, 253.0D, 20.0D, 20.0D);
      Stroke pincel = new BasicStroke(1.0F);
      g2.setStroke(pincel);
      g2.draw(l1);
      g2.draw(l2);
      g2.draw(l3);
      g2.draw(l4);
      g2.draw(l5);
      g2.draw(r1);
      g2.draw(r2);
      g2.draw(r3);
      g2.draw(r4);
   }
}
