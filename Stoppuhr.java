import ea.*;
import java.lang.Math.*;

import java.util.ArrayList;

public class Stoppuhr extends Textanzeige {
    private boolean running;

    private ArrayList<Double> times = new ArrayList<>();
    private double result;

    private Knoten wurzel = new Knoten();
    public Stoppuhr(int x, int y) {
        super(x, y, 70, "0", 0, 1);
        result = -1.0;
        background = new Rechteck(x + 30, y + 30, getBreite() + 300, getHoehe());
        wurzel.add(this);
    }

    @Override
    public void run() {

        while (running)
        {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {}

            currentNumber += 0.001;

            setzeInhalt("" +  Math.round(currentNumber*1000.0)/1000.0);
        }

        result = currentNumber;
    }

    public void stop()
    {
        running = false;
    }

    public void start()
    {
        running = true;
        new Thread(this).start();
    }

    public double getResult()
    {
        double res = result;
        times.add(res);
        return res;
    }

    public ArrayList<Double> getTimes()
    {
        return this.times;
    }


}
