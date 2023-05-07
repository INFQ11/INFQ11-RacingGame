
/**
 * 
 * @author: Konstantin S.
 * 
 * DIESE KLASSE NICHT VERÄNDERN!!!
 */
public abstract class Gamemode
{
    

    
    public static Gamemode getGamemode(GamemodeType gamemode)
    {
        switch(gamemode)
        {
            case EINZELSPIELER: return new Einzelspieler();
            
            case MEHRSPIELER: return new Mehrspieler();
            
            default: return null;
        }
    }

    
    
}
