import ea.*;

public class FahrerFacade
{
    private static boolean secondPlayer;
    private static Fahrer fahrer1;
    private static Fahrer fahrer2;
    private static Knoten wurzel = new Knoten();
    
    public static void instantiateFacade(myGame game)
    {
        
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
}
