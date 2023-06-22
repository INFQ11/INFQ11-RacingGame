import ea.*;

import java.awt.*;

public abstract class Textanzeige extends Text implements Runnable
{
    protected double adjNumber; 
    protected double currentNumber;

    protected Rechteck background;
    private Knoten wurzel = new Knoten();
    
    public Textanzeige(int x , int y, int schriftGroesse, String inhalt, double currentNumber, double adjNumber)
    {
        super(x,y, schriftGroesse, inhalt);
        setzeFarbe(Color.RED);
        setzeSchriftart(3);
        setX(x - getBreite()/2);
        setY(y - getHoehe()/2);
        this.adjNumber = adjNumber;
        this.currentNumber = currentNumber;
        background = new Rechteck(getX(), getY(), getBreite() + 30, getHoehe());
        wurzel.add(background);
        wurzel.add(this);
    }
    
    public abstract void run();

    public Raum getRaum ()
    {
        return wurzel;
    }
}
