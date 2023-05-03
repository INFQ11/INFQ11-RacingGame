import ea.*;

public class myGame extends Game
{
    private Maus maus;
    private Bildschirm currentBildschirm;
    private BildschirmType currentBildschirmType;
    
    private static myGame instance;
    
    public void tasteReagieren(int tastencode) {}
    
    public void bildschirmWechseln (BildschirmType bildschirm)
    {
        wurzel.leeren();
        currentBildschirmType = bildschirm;
        currentBildschirm = Bildschirm.getBildschirm(bildschirm);
        wurzel.add(currentBildschirm.getRaum());
    }
    
    // Singleton-Entwurfsmuster fehlt!
    
    public static myGame getInstance()
    {
        if (instance != null)
        return instance;
        else return instance = new myGame();
    }
    // ...
    
    private myGame()
    {
        // Um überhaupt die Computermaus nutzen zu können, muss zuerst eine Maus erstellt + angemeldet werden
        
        /**
         * Erstellung einer Maus + Anmeldung von jener in dem Bildschirm
         */
        // ...
        
        maus = new Maus(0);
        mausAnmelden(maus);
        
        /**
         * Erstellung des Objekts der Klasse, welche die Button-Codes und dazugehörigen Aktionen verbindet/verwaltet 
         */
        
        ButtonVerwaltung.createInstance(this);
        
        /**
         * Initialisierung der Buttons
         */
        
        ButtonSammlung.initButtons();
        
        // Ab hier können Bildschirme erzeugt + gewechselt werden
        
        // Zuerst muss zu dem Startbildschirm gewechselt werden
        
        //...
    }
    
    /**
         * CODE 0: STARTBUTTON
         * CODE 1: EINSTELLUNGEN
         * CODE 2: OK
         * CODE 3: PFEILVOR
         * CODE 4: PFEILZURÜCK
         * CODE 5: ZURÜCK
         * CODE 6: MEHRSPIELER
         * CODE 7: EINZELSPIELER
         */
        
       
    
     
    public Maus getMaus() {return maus;}
    
    public Bildschirm getCurrentBildschirm(){return currentBildschirm;};
    
    public BildschirmType getCurrentBildschirmType(){return currentBildschirmType;}
    
    public Knoten getWurzel() {return wurzel;}
    
    
    
    }      

