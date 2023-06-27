import ea.*;

import java.awt.*;

public abstract class Textanzeige extends Text implements Runnable
{
    protected double adjNumber; 
    protected double currentNumber;

    protected Rechteck background;
    protected Knoten wurzel = new Knoten();
    
    public Textanzeige(float x , float y, int schriftGroesse, String inhalt, double currentNumber, double adjNumber)
    {
        super(inhalt, x,y,schriftGroesse);
        setzeFarbe(Color.RED);
        setzeSchriftart(3);

        this.adjNumber = adjNumber;
        this.currentNumber = currentNumber;

        //wurzel.add(this);
        this.positionSetzen(x,y);
    }
    
    public abstract void run();

    public Raum getRaum ()
    {
        return wurzel;
    }
}
