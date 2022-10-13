package Graphics2D;
public class hilosPastelito implements Runnable{
    private int ventasAleatorias1;
    private int ventasAleatorias2;
    private int ventasAleatorias3;
    private int ventasAleatorias4;
    public hilosPastelito(int rango1, int rango2, int rango3,int rango4){
        ventasAleatorias1 = rango1;
        ventasAleatorias2 = rango2;
        ventasAleatorias3 = rango3;
        ventasAleatorias4 = rango4;

        int total;
        int ang1;
        int ang2;
        int ang3;
        int ang4;

        total = ventasAleatorias1 + ventasAleatorias2 + ventasAleatorias3 + ventasAleatorias4;
        ang1 = ventasAleatorias1 * 360 / total;
        ang2 = ventasAleatorias2 * 360 / total;
        ang3 = ventasAleatorias3 * 360 / total;
        ang4 = (360 - ang1 - ang2 - ang3);
        Graficas angs = new Graficas(ang1, ang2, ang3, ang4);
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " d1:" + ventasAleatorias1);
        System.out.println(Thread.currentThread().getName() + " d2:" + ventasAleatorias2);
        System.out.println(Thread.currentThread().getName() + " d3:" + ventasAleatorias3);
        System.out.println(Thread.currentThread().getName() + " d4:" + ventasAleatorias4);

    }
}