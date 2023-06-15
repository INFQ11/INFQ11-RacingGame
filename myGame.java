import ea.*;

/**
 * Spielsteuernde Klasse
 * @author: literaly everyone
 */

public class myGame extends Game implements TastenLosgelassenReagierbar, Ticker
{
    private static myGame instance;
    
    private Maus maus;
    
    private Bildschirm currentBildschirm;
    private BildschirmType currentBildschirmType;
    
    private GamemodeType currentGamemodeType;

    public void tasteReagieren(int tastencode) 
    {
        SteuerungFacade.tasteReagieren(tastencode);
        
        if (tastencode == 12)
            mausAnmelden(maus);
    }

    public static void main (String ... args)
    {
        myGame.getInstance();
    }
    
    @Override
    public void tick()
    {
        SteuerungFacade.tick();
    }
    
    public void tasteLosgelassen(int tastencode)
    {
        SteuerungFacade.tasteLosgelassen(tastencode);   
    }
    
    public void bildschirmWechseln (BildschirmType bildschirm)
    {
        wurzel.leeren();
        currentBildschirmType = bildschirm;
        currentBildschirm = BildschirmFacade.getBildschirm(bildschirm);
        wurzel.add(currentBildschirm.getRaum());
    }
    
    public void gamemodeSetzen(GamemodeType gamemode)
    {
        currentGamemodeType = gamemode;
    }
    
    public static myGame getInstance()
    {
        if (instance != null)
            return instance;
        else 
            return instance = new myGame();
    }
    
    private myGame()
    {
        super(TexturManager.BREITE, TexturManager.HOEHE);
        
        maus = new Maus(0);

        ButtonFacade.instantiateFacade(this);
        BildschirmFacade.instantiateFacade(this);
        
        bildschirmWechseln(BildschirmType.STARTBILDSCHIRM);
        
        manager.anmelden(this, 1);
        tastenLosgelassenReagierbarAnmelden(this);
    }
     
    public Maus getMaus() {return maus;}
    
    public Bildschirm getCurrentBildschirm(){return currentBildschirm;};
    
    public BildschirmType getCurrentBildschirmType(){return currentBildschirmType;}
    
    public Knoten getWurzel() {return wurzel;}
    
    public GamemodeType getCurrentGamemodeType() {return currentGamemodeType;}
    
    public Manager getManager() {return manager;}
    
}      

