/**
 * @Author Konstantin S.
 */

import ea.*;

public class Auswahlbildschirm_Spieler extends Bildschirm
{
    public Auswahlbildschirm_Spieler()
    {
        Bild bild = new Bild(0,0,100,TexturManager.DATEIPFAD + "Startbildschirm.png");
        wurzel.add(bild);
        
        ButtonFacade.getButton(ButtonType.EINSPIELER).setActive(true);
        wurzel.add(ButtonFacade.getButton(ButtonType.EINSPIELER));
        
        ButtonFacade.getButton(ButtonType.MEHRSPIELER).setActive(true);
        wurzel.add(ButtonFacade.getButton(ButtonType.MEHRSPIELER));
    }
    
    @Override
    public void tasteReagieren(int tastencode)
    {
        
    }
}
