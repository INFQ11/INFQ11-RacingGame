
public class SteuerungFacade
{
    private static boolean ticking;
    
    public static void tick()
    {
        if(ticking)
        FahrerFacade.tick();
    }
    
    public static void tasteReagieren(int tastencode)
    {
        FahrerFacade.tasteReagieren(tastencode);
    }
    
    public static void tasteLosgelassen(int tastencode)
    {
        FahrerFacade.tasteLosgelassen(tastencode);
    }
    
    public static void startTicker()
    {
        stoppuhr = new Stoppuhr(myGame.getInstance().getCam().getX() + 20, myGame.getInstance().getCam().getY() + 20);
        myGame.getInstance().getStatischeWurzel().add(stoppuhr.getRaum());
        stoppuhr.start();
        ticking = true;
    }
    public static void stopTicker() {
        ticking = false;
        stoppuhr.stop();
    }

    private static Stoppuhr stoppuhr;
    public static Stoppuhr getStoppuhr()
    {
        return stoppuhr;
    }
}
