
public class SteuerungFacade
{
    public static void tick()
    {
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
}
