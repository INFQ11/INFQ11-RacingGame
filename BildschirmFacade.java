
public class BildschirmFacade
{
    private static myGame game;
    private static Bildschirm currentBildschirm;
    
    public static void instantiateFacade(myGame game)
    {
        
    }
    
    public static Bildschirm getBildschirm(BildschirmType bildschirmType)
    {
        currentBildschirm = Bildschirm.getBildschirm(bildschirmType);
        return currentBildschirm;
    }
    
    public static void tasteReagieren(int tastencode)
    {
        FahrerFacade.tasteReagieren(tastencode);
    }
}
