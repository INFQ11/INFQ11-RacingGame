/**
 * @Author Konstantin S.
 */

import ea.*;

public class Startbildschirm extends Bildschirm
{
    public Startbildschirm()
    {
        Bild bild = new Bild(0,0,67,TexturManager.DATEIPFAD + "Startbildschirm.png");
        wurzel.add(bild);
        
        buttons[0].isActive = true;
        wurzel.add(buttons[0]);
    }
    
    @Override
    public void tasteReagieren(int tastencode)
    {
        
    }
}
