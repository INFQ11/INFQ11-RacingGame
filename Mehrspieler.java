// Konstantin S.

import ea.*;

public class Mehrspieler extends Bildschirm
{
    public Mehrspieler()
    {
        Bild bild = new Bild(0,0,TexturManager.BREITE, TexturManager.HOEHE,TexturManager.DATEIPFAD + "Strecke.png");
        wurzel.add(bild);
        
        Fahrer fahrer1 = new Fahrer(TexturManager.BREITE/2,TexturManager.HOEHE/2, 10, "Fahrer 1", LEHRER.GUST, false);
        Fahrer fahrer2 = new Fahrer(TexturManager.BREITE/2,TexturManager.HOEHE/2, 10, "Fahrer 2", LEHRER.GUST, true);
        
        wurzel.add(FahrerFacade.getRaum());
    }
    
    @Override
    public void tasteReagieren(int tastencode)
    {

    }
}
