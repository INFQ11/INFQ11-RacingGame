import ea.*;

/**
 * Spielsteuernde Klasse
 */

public class myGame extends Game implements TastenLosgelassenReagierbar, Ticker
{
    private static myGame instance;
    
    private Maus maus;
    
    private Bildschirm currentBildschirm;
    private BildschirmType currentBildschirmType;
    
    private GamemodeType currentGamemodeType;
    
    private static Auto autoSpieler1;
    private static Auto autoSpieler2;

    public void tasteReagieren(int tastencode) 
    {
        currentBildschirm.tasteReagieren(tastencode);
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
        if (autoSpieler1 != null)
            autoSpieler1.tick();
            
        if (autoSpieler2 != null)
            autoSpieler2.tick();    
    }
    
    public void tasteLosgelassen(int tastencode)
    {
        if (autoSpieler1 != null)
            autoSpieler1.tasteLosgelassen(tastencode);
            
        if (autoSpieler2 != null)
            autoSpieler2.tasteLosgelassen(tastencode);    
    }
    
    public void bildschirmWechseln (BildschirmType bildschirm)
    {
        wurzel.leeren();
        currentBildschirmType = bildschirm;
        currentBildschirm = Bildschirm.getBildschirm(bildschirm);
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

        ButtonVerwaltung.createInstance(this);
        ButtonSammlung.instantiateButtons();
        
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
    
    public static void setAutoSpieler1(Auto auto) {autoSpieler1 = auto;}
    
    public static Auto getAutoSpieler1() {return autoSpieler1;}
    
    public static void setAutoSpieler2(Auto auto) {autoSpieler2 = auto;}
    
    public static Auto getAutoSpieler2() {return autoSpieler2;}
}      

