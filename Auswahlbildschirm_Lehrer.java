/**
 * @Author Konstantin S.
 */

import ea.*;

public class Auswahlbildschirm_Lehrer extends Bildschirm
{
    public static Lehrerauswahl lehrerauswahl;
    
    public Auswahlbildschirm_Lehrer()
    {
        Bild background = new Bild(0,0,100,TexturManager.DATEIPFAD + "Einzelspieler.png");
        wurzel.add(background);
        
        ButtonFacade.getButton(ButtonType.OK).setActive(true);
        wurzel.add(ButtonFacade.getButton(ButtonType.OK));
        
        ButtonFacade.getButton(ButtonType.PFEILVOR).setActive(true);
        wurzel.add(ButtonFacade.getButton(ButtonType.PFEILVOR));
    
        lehrerauswahl = new Lehrerauswahl(800,350,900,330);
        wurzel.add(lehrerauswahl.getRaum());
    }
    
    @Override
    public void tasteReagieren(int tastencode)
    {
        
    }
}
