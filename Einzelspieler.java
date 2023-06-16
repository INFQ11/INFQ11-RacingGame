// Konstantin Silberbauer Q11

import ea.*;

public class Einzelspieler extends Bildschirm
{
    
    public Einzelspieler()
    {


        //Bild bild = new Bild(500,500,TexturManager.BREITE, TexturManager.HOEHE,TexturManager.DATEIPFAD + "Startbildschirm.png");
        //wurzel.add(bild);

        Bild b = new Bild(0, 0, 300, "C://Users//KSilb//downloads//Strecke.png");
        wurzel.add(b);

        Fahrer fahrer = new Fahrer(500,1000,10, "Player 1", LEHRER.GUST, false);
        wurzel.add(FahrerFacade.getRaum());

        Rechteck WandVert1 = new Rechteck(400,0,10,100);
        WandVert1.passivMachen();
        wurzel.add(WandVert1);
    }
    
    @Override
    public void tasteReagieren(int tastencode)
    {

    }
}
