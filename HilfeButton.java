
/**
 * @Author: Konstantin S.
 */
import ea.*;

public class HilfeButton extends Button
{
    
    public HilfeButton(float x, float y, int groesse, String newDateipfad)
    {
        super(x,y,groesse,newDateipfad);
    }

    @Override
    public int getCode()
    {
        return 8;
    }
    
    public void gedrückt()
    {
        myGame.getInstance().bildschirmWechseln(BildschirmType.HILFE);
    }
}
