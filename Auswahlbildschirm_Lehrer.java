/**
 * @Author Konstantin S.
 */

import ea.*;

public class Auswahlbildschirm_Lehrer extends Bildschirm
{
    public static Lehrerauswahl lehrerauswahl;
    
    public Auswahlbildschirm_Lehrer()
    {
        Bild background = new Bild(0,0, 30,TexturManager.DATEIPFAD + "Auswahlbildschirm_Lehrer (Einzel - Pixel).png");
        wurzel.add(background);
        
        buttons[3].isActive = true;
        wurzel.add(buttons[3]);
        
        buttons[2].isActive = true;
        wurzel.add(buttons[2]);
    
        lehrerauswahl = new Lehrerauswahl(500,400,650,400,500,600);
        wurzel.add(lehrerauswahl.getRaum());
    }
    
    @Override
    public void tasteReagieren(int tastencode)
    {
        
    }
}
