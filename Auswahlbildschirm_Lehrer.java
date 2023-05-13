/**
 * @Author Konstantin S.
 */

import ea.*;

public class Auswahlbildschirm_Lehrer extends Bildschirm
{
    public Auswahlbildschirm_Lehrer()
    {
        int breite = TexturManager.BREITE;
        int höhe = TexturManager.HOEHE;
        
        Bild background = new Bild(0,0,breite, höhe,TexturManager.DATEIPFAD + "Hintergrund.jpg");
        wurzel.add(background);
        
        /**
         * Information: Buttons müssen nun nicht mehr in ButtonSammlung erzeugt
         * oder angemeldet werden!
         */
        
        
        buttons[3].isActive = true;
        wurzel.add(buttons[3]);
        
        
        buttons[4].isActive = true;
        wurzel.add(buttons[4]);
        
        
        buttons[2].isActive = true;
        wurzel.add(buttons[2]);
    }
    
    @Override
    public void tasteReagieren(int tastencode)
    {
        
    }
}
