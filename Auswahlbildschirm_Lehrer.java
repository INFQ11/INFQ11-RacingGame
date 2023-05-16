/**
 * @Author Konstantin S.
 */

import ea.*;

public class Auswahlbildschirm_Lehrer extends Bildschirm
{
    public static Lehrerauswahl lehrerauswahl;
    
    public Auswahlbildschirm_Lehrer()
    {
        Bild background = new Bild(0,0,TexturManager.BREITE, TexturManager.HOEHE,TexturManager.DATEIPFAD + "Hintergrund.jpg");
        wurzel.add(background);
        
        buttons[3].isActive = true;
        wurzel.add(buttons[3]);
        
        buttons[4].isActive = true;
        wurzel.add(buttons[4]);
        
        buttons[2].isActive = true;
        wurzel.add(buttons[2]);
    
        lehrerauswahl = new Lehrerauswahl();
        wurzel.add(lehrerauswahl.getRaum());
    }
    
    @Override
    public void tasteReagieren(int tastencode)
    {
        
    }

    

}
