// Max E.

import ea.*;

public abstract class Bildschirm
{
    protected Knoten wurzel = new Knoten();
    
    protected Button [] buttons = ButtonVerwaltung.getInstance().getButtons();
    
     public static Bildschirm getBildschirm(BildschirmType bildschirm)
    {
        
        switch (bildschirm)
        {
            case STARTBILDSCHIRM: return new Startbildschirm();
            
            case AUSWAHLBILDSCHIRM_SPIELER: return new Auswahlbildschirm_Spieler();
            
            case AUSWAHLBILDSCHIRM_LEHRER: return new Auswahlbildschirm_Lehrer();
            
            case EINZELSPIELER: return new Einzelspieler();
            
            case MEHRSPIELER: return new Mehrspieler();
            
            default: throw new UnsupportedOperationException("No verified BildschirmType selected");
        }
    }
    
    public Bildschirm()
    {
        for (Button b : ButtonVerwaltung.getInstance().getButtons())
        {
            if (b!= null) b.isActive = false;
        }
    }
    
    public Raum getRaum(){return wurzel;}
    
    public abstract void tasteReagieren(int tastencode);
}
