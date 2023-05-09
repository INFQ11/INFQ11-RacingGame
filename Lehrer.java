import ea.*;

/**
 * 
 * @author: Konstantin S.
 * 
 */
public abstract class Lehrer
{
    
    
    
    public static Lehrer getLehrer(int i)
    {
        switch(i)
        {
            case 1: return new Adam();
            
            case 2: return new Ehrenthaler();
            
            case 3: return new Gust();
            
            case 4: return new Loistl();
            
            case 5: return new Pleyer();
            
            case 6: return new Sauer();
            
            case 7: return new Schmelmer();
            
            case 8: return new Stuffer();
            
            case 9: return new Tremmel();
            
            case 10: return new Wecker();
            
            default: return null;
        }
    }
    
    
    
}
