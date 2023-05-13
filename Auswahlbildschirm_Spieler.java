/**
 * @Author Konstantin S.
 */

import ea.*;

public class Auswahlbildschirm_Spieler extends Bildschirm
{
    public Auswahlbildschirm_Spieler()
    {
        int breite = TexturManager.BREITE;
        int höhe = TexturManager.HOEHE;
        
        Bild bild = new Bild(0,0,breite, höhe,TexturManager.DATEIPFAD + "Hintergrund.jpg");
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
