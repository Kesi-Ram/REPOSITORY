//KACEY ROYCE TYNE SANGBAAN
//CITCS 1N-A
import java.awt.*;
import javax.swing.*;

public class DrawShapes extends Canvas{
    public void paint(Graphics d){
        d.setColor(Color.LIGHT_GRAY);

        d.fillOval(750, 280, 200, 200);
        d.fillOval(710, 450, 300, 200);
        d.fillOval(620, 600, 500, 350);

        d.setColor(Color.BLACK);
        d.drawLine(750, 500, 550, 550);
        d.drawLine(950, 500, 1150, 350);

        d.setColor(Color.BLACK);
        d.fillOval(780, 350, 50, 50);
        d.fillOval(850, 350, 50, 50);
        d.fillRect(800, 150, 100, 150);
        d.fillRect(750, 250, 200, 50);


        /*d.fillArc(650, 500, 300, 300, 500, 500);
        d.fillArc(850, 500, 300, 300, 500, 500);
        d.fillOval(790, 10, 200, 600);*/
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing Shapes Example");
        DrawShapes canvas = new DrawShapes();

        frame.setSize(1920,1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(canvas);
        frame.setVisible(true);
    }
}
