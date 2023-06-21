// Konstantin S.

import ea.*;

public class Mehrspieler extends Bildschirm
{
    public Mehrspieler()
    {
        Bild bild = new Bild(0,0,100,TexturManager.DATEIPFAD + "Strecke (Upscaled).png");
        wurzel.add(bild);
        
        LEHRER lehrer = myGame.getInstance().getLehrer();
        Fahrer fahrer1 = new Fahrer(TexturManager.BREITE/2,TexturManager.HOEHE/2, 100, "Fahrer 1", lehrer, false);
        
        if (myGame.getInstance().getClient() != null)
        {
        // Send to server
        myGame.getInstance().getClient().sendeString(myGame.getInstance().getPrefix() + " " + myGame.SEND_FAHRER + " " + lehrer.toString());
        
        while(FahrerFacade.getFahrer2() == null) {}
        }
        
        Fahrer fahrer2 = new Fahrer(TexturManager.BREITE/2, TexturManager.HOEHE/2, 100, "Fahrer 2", lehrer, true);
        
        wurzel.add(FahrerFacade.getRaum());
    }
    
    @Override
    public void tasteReagieren(int tastencode)
    {

    }
}
