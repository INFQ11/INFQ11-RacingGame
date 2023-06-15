// Konstantin S.

import ea.*;

public class Mehrspieler extends Bildschirm
{
    public Mehrspieler()
    {
        Bild bild = new Bild(0,0,TexturManager.BREITE, TexturManager.HOEHE,"C://Users//KSilb//downloads//Strecke.png");
        wurzel.add(bild);
        
        Fahrer fahrer1 = new Fahrer(TexturManager.BREITE/2,TexturManager.HOEHE/2, 100, "Fahrer 1", LEHRER.GUST, false);
        Fahrer fahrer2 = new Fahrer(TexturManager.BREITE/2,TexturManager.HOEHE/2, 100, "Fahrer 2", LEHRER.GUST, true);
        
        wurzel.add(FahrerFacade.getRaum());
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
