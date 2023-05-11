/**
 * DIESE KLASSE NICHT VERÄNDERN
 */

import ea.*;

public abstract class Bildschirm
{
    protected Knoten wurzel = new Knoten();
    
     public static Bildschirm getBildschirm(BildschirmType bildschirm)
    {
        
        switch (bildschirm)
        {
            case STARTBILDSCHIRM: return new Startbildschirm();
            
            case AUSWAHLBILDSCHIRM_SPIELER: return new Auswahlbildschirm_Spieler();
            
            case AUSWAHLBILDSCHIRM_LEHRER: return new Auswahlbildschirm_Lehrer();
            
            case SPIELBILDSCHIRM: return new Spielbildschirm();
            
            default: return null;
        }
        
        
    }
    
    public Raum getRaum(){return wurzel;}
    
    public Bildschirm()
    {
        for (Button b : ButtonVerwaltung.getInstance().getButtons())
        {
            if (b!= null) b.isActive = false;
        }
    }
}
