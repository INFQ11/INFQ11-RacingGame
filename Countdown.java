import ea.*;
import java.awt.*;

public class Countdown extends Textanzeige
{
    private int x;
    private int y;
public Countdown(int x, int y)
{
        super(x,y, 400, "5", 5, 1);
        this.x = x;
        this.y = y;
        background = new Rechteck(0,0,3840, 2160);
        background.farbeSetzen(Color.BLACK);
        wurzel.add(background);
        wurzel.add(this);
        leuchtetSetzen(true);
}
    
public void run()
{
    while(currentNumber > 0)
    {
    try
    {
        Thread.sleep(1000);
    }
    catch (InterruptedException ie){}
    currentNumber -= 1;
    setzeInhalt("" + (int)currentNumber);
    }
    setzeGroesse(200);
    positionSetzen(x-270, y + 100);
    setzeInhalt("START");
    try
    {
        Thread.sleep(500);
    }
    catch (InterruptedException ie){}

    sichtbarSetzen(false);
    background.sichtbarSetzen(false);
    
    SteuerungFacade.startTicker();
}
}

