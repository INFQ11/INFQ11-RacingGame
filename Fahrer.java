// Max E.

import ea.*;

public class Fahrer
{
    private int x;
    private int y;
    private int groesse;
    
    private String name;
    private int punktzahl;
    private LEHRER lehrer;
    private Auto auto;
    
    private boolean secondPlayer;
    
    public Fahrer(int x, int y, int groesse, String name, LEHRER lehrer, boolean secondPlayer)
    {
        this.x = x;
        this.y = y;
        this.groesse = groesse;
        this.name = name;
        this.punktzahl = 0;
        this.lehrer = lehrer;
        this.auto = new Auto(x,y,groesse, lehrer, secondPlayer);
        this.secondPlayer = secondPlayer;
        
        if (!secondPlayer)
            myGame.setAutoSpieler1(auto);
        else myGame.setAutoSpieler2(auto);    
    }
    
    public void lehrerWechseln(LEHRER newLehrer)
    {
        this.lehrer = newLehrer;
        this.auto = new Auto(x,y,groesse, lehrer, secondPlayer);
        
        if (!secondPlayer)
            myGame.setAutoSpieler1(auto);
        else myGame.setAutoSpieler2(auto);
    }
    
    public Raum getRaum() {return this.auto;}
}
