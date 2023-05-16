// Konstantin S.

import ea.*;

public class Einzelspieler extends Bildschirm
{
    
    public Einzelspieler()
    {
        Bild bild = new Bild(0,0,TexturManager.BREITE, TexturManager.HOEHE,TexturManager.DATEIPFAD + "Hintergrund.jpg");
        wurzel.add(bild);
        
        Fahrer fahrer = new Fahrer(0,0,100, "Player 1", LEHRER.GUST, false);
        wurzel.add(fahrer.getRaum());
    }
    
    @Override
    public void tasteReagieren(int tastencode)
    {
        if (myGame.getAutoSpieler1() != null)
            myGame.getAutoSpieler1().tasteReagieren(tastencode);
    }
}
