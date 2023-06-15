// Konstantin S.

import ea.*;

public class Mehrspieler extends Bildschirm
{
    public Mehrspieler()
    {
        Bild bild = new Bild(0,0,TexturManager.BREITE, TexturManager.HOEHE,TexturManager.DATEIPFAD + "Mehrspieler.png");
        wurzel.add(bild);
        
        Fahrer fahrer1 = new Fahrer(0,0, 100, "Fahrer 1", LEHRER.GUST, false);
        Fahrer fahrer2 = new Fahrer(500,0, 100, "Fahrer 1", LEHRER.GUST, true);
        
        wurzel.add(FahrerFacade.getRaum());
    }
    
    @Override
    public void tasteReagieren(int tastencode)
    {

    }
}
