import ea.*;
import java.lang.Math.*;
import java.awt.*;

import java.util.ArrayList;

public class Stoppuhr extends Textanzeige {
    private boolean running;

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


    public void start()
    {
        running = true;
        new Thread(this).start();
    }

    public void computeResult()
    {
        running = false;
    }

    public double getResult() {
        return QuestionController.getCorrectAnswers()*Math.round(result*1000.0)/1000.0;
    }


}
