import ea.*;

/**
 * Spielsteuernde Klasse
 * @author: literaly everyone
 */

public class myGame extends Game implements TastenLosgelassenReagierbar, Ticker
{
    private static myGame instance;
    
    
    private myClient client;
    public static final int STANDARD_PORT = 7001;
    public static final String IP = "192.168.220.170";
    public static final String REQUEST_FREE_PORT = "RFP";
    private String prefix = "X";
    
    
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
        rechenintensiveArbeitSetzen(true);
        maus = new Maus(0);

        ButtonFacade.instantiateFacade(this);
        BildschirmFacade.instantiateFacade(this);
        
        bildschirmWechseln(BildschirmType.STARTBILDSCHIRM);
        
        manager.anmelden(this, 1);
        tastenLosgelassenReagierbarAnmelden(this);
    }
    
    
    public void multiplayerInstantiation()
    {
        if (frage("Möchtest du eine neue Multiplayer-Lobby öffnen?"))
        {
            createMultiplayerGame();
            nachrichtSchicken("Dies ist euer Lobby-Code: " + client.getPort());
        }
        else {
            int code = -1;
            do {
            String lobbyCode = eingabeFordern("Bitte gib den Lobby-Code ein");
            try 
            {
                if (lobbyCode == null)
                {
                   nachrichtSchicken("Bitte in Integer-Format eingeben"); 
                }
                code = Integer.parseInt(lobbyCode);
                if (code < 7001 || code > 7010)
                {
                    nachrichtSchicken("Kein gültiger Code");
                }
            }
            catch (NumberFormatException e)
            {
                nachrichtSchicken("Bitte in Integer-Format eingeben");
            }
        } while (code < 0);
        
        joinMultiplayerGame(code);
        }
        
    }
    
    public void createMultiplayerGame()
    {
        if (!prefix.equals("X"))
            throw new UnsupportedOperationException("Multiplayer game has already been created");
            
        client = new myClient(IP, STANDARD_PORT, "");   
        client.sendeString(REQUEST_FREE_PORT);
        prefix = "A";
        
        while (client.getFreePort() == -1) {}
        
        client = new myClient(IP, client.getFreePort(), prefix);
    }
    
    public void joinMultiplayerGame(int port)
    {
        if (!prefix.equals("X"))
            throw new UnsupportedOperationException("Multiplayer game has already been joined");
            
        prefix = "B";
        client = new myClient(IP, port, prefix);
    }
    
     
    public Maus getMaus() {return maus;}
    
    public Bildschirm getCurrentBildschirm(){return currentBildschirm;};
    
    public BildschirmType getCurrentBildschirmType(){return currentBildschirmType;}
    
    public Knoten getWurzel() {return wurzel;}
    
    public GamemodeType getCurrentGamemodeType() {return currentGamemodeType;}
    
    public Manager getManager() {return manager;}
    
    public Kamera getCam() {return cam;}
    
    public String getPrefix()
    {
        return prefix;
    }
    
    public myClient getClient()
    {
        return client;
    }
}      

