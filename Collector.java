/**
 * Vorlagen für Methoden im TODO
 * @Author: Max E.
 */

public class Collector
{   
  
/*  
  
1.)

STARTBILDSCHIRM, AUSWAHLBILDSCHIRM_LEHRER, AUSWAHLBILDSCHIRM_SPIELER, SPIELBILDSCHIRM
  

2.)

public static Bildschirm getBildschirm(BildschirmType bildschirm)
    {
        switch (bildschirm)
        {
            case STARTBILDSCHIRM: return new Startbildschirm();
            
            case AUSWAHLBILDSCHIRM_SPIELER: return new Auswahlbildschirm_Spieler();
            
            case AUSWAHLBILDSCHIRM_LEHRER: return new Auswahlbildschirm_Lehrer();
            
            case SPIELBILDSCHIRM: return new Spielbildschirm();
        };
    }
    
3.) 
    
public static myGame getInstance()
    {
        if (instance != null)
        return instance;
        else return instance = new myGame();
    }
    
4.)

private Maus maus;
private Bildschirm currentBildschirm;
private BildschirmType currentBildschirmType;

5.)

maus = new Maus (0);
mausAnmelden(maus);

6.)

...

7.)

   public void bildschirmWechseln (BildschirmType bildschirm)
    {
        wurzel.leeren();
        this.currentBildschirm = Bildschirm.getBildschirm(bildschirm);
        this.currentBildschirmType = bildschirm;
        wurzel.add(currentBildschirm.getRaum());
    }
    
8.)

public int getCode()
{
    return 0;
}

public void gedrückt()
{
    
}

9.)

ButtonVerwaltung.getInstance().buttonAnmelden(new StartButton(0,0,0,"");
ButtonVerwaltung.getInstance().buttonAnmelden(new EinstellungenButton(0,0,0,""),  
ButtonVerwaltung.getInstance().buttonAnmelden(new OKButton(0,0,0,""),  
ButtonVerwaltung.getInstance().buttonAnmelden(new PfeilVorButton(0,0,0,""),  
ButtonVerwaltung.getInstance().buttonAnmelden(new PfeilZurückButton(0,0,0,""),  
ButtonVerwaltung.getInstance().buttonAnmelden(new ZurückButton(0,0,0,""),  
ButtonVerwaltung.getInstance().buttonAnmelden(new MehrsoielerButton(0,0,0,""),  
ButtonVerwaltung.getInstance().buttonAnmelden(new EinzelspielerButton(0,0,0,""),    
    

*/  
}