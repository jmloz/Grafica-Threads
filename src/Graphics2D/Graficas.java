package Graphics2D;
import java.awt.*;


import java.awt.geom.*;
import javax.swing.*;
public class Graficas extends JPanel{
    int angulo1;
    int angulo2;
    int angulo3;
    int angulo4;
    public Graficas() {

    }
    public Graficas(int ang1, int ang2, int ang3, int ang4) {
        angulo1 = ang1;
        angulo2 = ang2;
        angulo3 = ang3;
        angulo4 = ang4;
        System.out.println("Angulos d1: " + angulo1);
        System.out.println("Angulos d2: " + angulo2);
        System.out.println("Angulos d3: " + angulo3);
        System.out.println("Angulos d4: " + angulo4);
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Arc2D.Float arco = new Arc2D.Float(Arc2D.PIE);
        arco.setFrame(50,10,400,400);

        //departamento1
        arco.setAngleStart(0);
        arco.setAngleExtent(angulo1);
        g2.setColor(Color.BLACK);
        g2.draw(arco);
        g2.setColor(Color.MAGENTA);
        g2.fill(arco);

        //departamento2
        arco.setAngleStart(angulo1);
        arco.setAngleExtent(angulo2);
        g2.setColor(Color.BLACK);
        g2.draw(arco);
        g2.setColor(Color.LIGHT_GRAY);
        g2.fill(arco);

        //departamento3
        arco.setAngleStart(angulo1+angulo2);
        arco.setAngleExtent(angulo3);
        g2.setColor(Color.BLACK);
        g2.draw(arco);
        g2.setColor(Color.PINK);
        g2.fill(arco);

        //departamento4
        arco.setAngleStart(angulo1+angulo2+angulo3);
        arco.setAngleExtent(angulo4);
        g2.setColor(Color.BLACK);
        g2.draw(arco);
        g2.setColor(Color.YELLOW);
        g2.fill(arco);
    }
}