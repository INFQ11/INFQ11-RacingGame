import ea.*;

public class FahrerFacade implements Runnable
{
    private static boolean secondPlayer;
    private static Fahrer fahrer1;
    private static Fahrer fahrer2;
    private static Knoten wurzel = new Knoten();
    
    public static void instantiateFacade(myGame game)
    {
        
    }
    
    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                Thread.sleep(5);
            }
            catch (InterruptedException ie){}
            myGame.getInstance().getClient().sendeString(myGame.getInstance().getPrefix() + " " + FahrerFacade.getFahrer1().getCar().getX() + " " + FahrerFacade.getFahrer1().getCar().getY() + " " + FahrerFacade.getFahrer1().getCar().getRotation());
        }
    }
    
    public static void addFahrer(Fahrer fahrer)
    {
        if (fahrer1 == null)
        {
            fahrer1 = fahrer;
            wurzel.add(fahrer1.getRaum());
        }
        else {
            fahrer2 = fahrer;
            wurzel.add(fahrer2.getRaum());
            secondPlayer = true;
        }
    }
    
    public static void startServerPings()
    {
        new Thread(new FahrerFacade()).start();
    }
    
    // TODO: fahrer wechseln
    
    public static void tick()
    {
        if (fahrer1 != null)
        fahrer1.tick();
        if (fahrer2 != null)
        fahrer2.tick();
    }
    
    public static void tasteReagieren(int code)
    {
        if (fahrer1 != null)
        fahrer1.tasteReagieren(code);
        if (fahrer2 != null)
        fahrer2.tasteReagieren(code);
    }
    
    public static void tasteLosgelassen(int code)
    {
        if (fahrer1 != null)
        fahrer1.tasteLosgelassen(code);
        if (fahrer2 != null)
        fahrer2.tasteLosgelassen(code);
    }
    
    public static Fahrer getFahrer1()
    {
        return fahrer1;
    }
    
    public static Fahrer getFahrer2()
    {
        return fahrer2;
    }
    
    public static Raum getRaum()
    {
        return wurzel;
    }
    
    public static void setFahrer2(Fahrer fahrer)
    {
        fahrer2 = fahrer;
    }
}
