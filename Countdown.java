import ea.*;

public class Countdown extends Textanzeige
{
public Countdown(int x, int y)
{
        super(x,y, 400, "5", 5, 1);
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
    background.sichtbarSetzen(false);
    setzeGroesse(200);

    setzeInhalt("START");
    try
    {
        Thread.sleep(500);
    }
    catch (InterruptedException ie){}

    sichtbarSetzen(false);

    SteuerungFacade.startTicker();
    myGame.getInstance().getCurrentBildschirm().wurzel.add(SteuerungFacade.getStoppuhr().getRaum());
}
}

