// Konstantin S.

import ea.*;

public class Einzelspieler extends Bildschirm
{
    
    public Einzelspieler()
    {


        //Bild bild = new Bild(500,500,TexturManager.BREITE, TexturManager.HOEHE,TexturManager.DATEIPFAD + "Startbildschirm.png");
        //wurzel.add(bild);

        Bild b = new Bild(0, 0, 150, "C://Users//KSilb//downloads//Strecke.png");
        wurzel.add(b);

        Fahrer fahrer = new Fahrer(0,0,50, "Player 1", LEHRER.GUST, false);
        wurzel.add(fahrer.getRaum());


    }
    
    @Override
    public void tasteReagieren(int tastencode)
    {
        if (myGame.getAutoSpieler1() != null)
            myGame.getAutoSpieler1().tasteReagieren(tastencode);
    }
}
