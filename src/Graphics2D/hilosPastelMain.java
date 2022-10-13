package Graphics2D;
import javax.swing.*;
import java.awt.*;

public class hilosPastelMain {
    public static void main(String[] args) throws InterruptedException {
        int rango1 = 0;
        int rango2 = 0;
        int rango3 = 0;
        int rango4 = 0;
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame ventana = new JFrame("Grafica");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBackground(Color.white);
        ventana.setSize(800,800);

        Graficas panel = new Graficas();
        ventana.add(panel);
        ventana.setVisible(true);
        do {
                rango1 = (int) Math.floor(Math.random() * (1500 - 100 + 1) + 100);
                rango2 = (int) Math.floor(Math.random() * (1500 - 100 + 1) + 100);
                rango3 = (int) Math.floor(Math.random() * (1500 - 100 + 1) + 100);
                rango4 = (int) Math.floor(Math.random() * (1500 - 100 + 1) + 100);
                Thread t = new Thread(new hilosPastelito(rango1, rango2, rango3, rango4));
                t.start();
                t.sleep(10000L);
        } while (rango1 != 0);
    }
}