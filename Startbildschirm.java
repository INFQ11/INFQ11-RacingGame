/**
 * @Author Konstantin S.
 */

import ea.*;

public class Startbildschirm extends Bildschirm
{
    public Startbildschirm()
    {
        int breite = TexturManager.BREITE;
        int höhe = TexturManager.HOEHE;
        
        Bild bild = new Bild(0,0,breite, höhe,TexturManager.DATEIPFAD + "Design-Pixel.png");
        wurzel.add(bild);
        
        buttons[0].isActive = true;
        wurzel.add(buttons[0]);
    }
    
    @Override
    public void tasteReagieren(int tastencode)
    {
        
    }
}
