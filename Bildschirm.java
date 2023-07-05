// Max E.

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

            //case AUSWAHLBILDSCHIRM_LEHRER_MEHRSPIELER: return new Auswahlbildschirm_Lehrer_Mehrspieler();
            
            case EINZELSPIELER: return new Einzelspieler();
            
            case MEHRSPIELER: return new Mehrspieler();
            
            case HILFE: return new Hilfe();
            
            default: throw new UnsupportedOperationException("No verified BildschirmType selected");
        }
    }
    
    public Bildschirm()
    {
        ButtonFacade.resetButtons();
    }
    
    public Raum getRaum(){return wurzel;}
    
    public void initialize()
    {
        
    }
    
    public abstract void tasteReagieren(int tastencode);
}
