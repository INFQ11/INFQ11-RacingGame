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
        
        FahrerFacade.addFahrer(this);   
    }
    
    public void lehrerWechseln(LEHRER newLehrer)
    {
        this.lehrer = newLehrer;
        this.auto = new Auto(x,y,groesse, lehrer, secondPlayer);
    }
    
    public Raum getRaum() {return this.auto;}
    
    public void tasteReagieren(int code)
    {
        this.auto.tasteReagieren(code);
    }
    
    public void tasteLosgelassen(int code)
    {
        this.auto.tasteLosgelassen(code);
    }
    
    public void tick()
    {
        this.auto.tick();
    }
    
    public void moveCar (Punkt p, float rotation)
    {
        this.auto.positionSetzen(p);
        this.auto.setRotation(rotation);
    }
    
    public Auto getCar()
    {
        return auto;
    }
}
