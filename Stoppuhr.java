import ea.*;
import java.lang.Math.*;
import java.awt.*;

import java.util.ArrayList;

public class Stoppuhr extends Textanzeige {
    private boolean running;

    private ArrayList<Double> times = new ArrayList<>();
    private double result;
    
    public Stoppuhr(float x, float y) {
        super(x, y, 70, "0", 0, 1);
        result = -1.0;
        background = new Rechteck(0,0,500,170);
        Text t = new Text(15,100,25, FahrerFacade.getCurrentFahrer().toString());
        t.setzeFarbe(Color.BLACK);
        wurzel.add(background);
        wurzel.add(t);
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
