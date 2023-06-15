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
        
        ButtonFacade.getButton(ButtonType.START).setActive(true);
        wurzel.add(ButtonFacade.getButton(ButtonType.START));
    }
    
    @Override
    public void tasteReagieren(int tastencode)
    {
        
    }
}
