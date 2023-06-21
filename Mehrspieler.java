// Konstantin S.

import ea.*;

public class Mehrspieler extends Bildschirm
{
    public Mehrspieler()
    {
        Bild bild = new Bild(0,0,TexturManager.BREITE, TexturManager.HOEHE,TexturManager.DATEIPFAD + "Strecke.png");
        wurzel.add(bild);
        
        LEHRER lehrer = myGame.getInstance().getLehrer();
        Fahrer fahrer1 = new Fahrer(TexturManager.BREITE/2,TexturManager.HOEHE/2, 10, "Fahrer 1", LEHRER.GUST, false);
        
        // Send to server
        myGame.getInstance().getClient().sendeString(myGame.getInstance().getPrefix() + " " + myGame.SEND_FAHRER + " " + lehrer.toString());
        
        while(FahrerFacade.getFahrer2() == null) {}
        
        wurzel.add(FahrerFacade.getRaum());
    }
    
    @Override
    public void tasteReagieren(int tastencode)
    {

    }
}
