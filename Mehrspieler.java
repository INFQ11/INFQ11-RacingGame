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
        
        wurzel.add(fahrer1.getRaum());
        wurzel.add(fahrer2.getRaum());
    }
    
    @Override
    public void tasteReagieren(int tastencode)
    {
        // TODO: Abprüfen, für welches Auto die Kommandos zählen sollen
        
        if (myGame.getAutoSpieler1() != null)
            myGame.getAutoSpieler1().tasteReagieren(tastencode);
            
        if (myGame.getAutoSpieler2() != null)
            myGame.getAutoSpieler2().tasteReagieren(tastencode);
    }
}
