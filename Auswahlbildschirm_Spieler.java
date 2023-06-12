/**
 * @Author Konstantin S.
 */

import ea.*;

public class Auswahlbildschirm_Spieler extends Bildschirm
{
    public Auswahlbildschirm_Spieler()
    {
        Bild bild = new Bild(0,0,67,TexturManager.DATEIPFAD + "Startbildschirm.png");
        wurzel.add(bild);
        
        buttons[6].isActive = true;
        wurzel.add(buttons[6]);
        
        buttons[7].isActive = true;
        wurzel.add(buttons[7]);
    }
    
    @Override
    public void tasteReagieren(int tastencode)
    {
        
    }
}
