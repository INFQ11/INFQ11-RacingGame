import ea.*;

public class Auswahlbildschirm_Lehrer extends Bildschirm
{
    public Auswahlbildschirm_Lehrer()
    {
        int breite = myGame.BREITE;
        int höhe = myGame.HOEHE;
        
        Bild bild = new Bild(0,0,breite, höhe,"C:\\Users\\ksilb\\OneDrive\\Dokumente\\Schule\\Info Projekt\\+libs\\Bilder\\Startbildschirm.jpg");
        wurzel.add(bild);
        
        /**
         * Information: Buttons müssen nun nicht mehr in ButtonSammlung erzeugt
         * oder angemeldet werden!
         */
        
        PfeilVorButton PVB = new PfeilVorButton(0,0,50,"C:\\Users\\ksilb\\OneDrive\\Bilder\\Saved_Pictures\\Button.png");
        PVB.isActive = true;
        wurzel.add(PVB);
        
        PfeilZurückButton PZB = new PfeilZurückButton(350,0,50,"C:\\Users\\ksilb\\OneDrive\\Bilder\\Saved_Pictures\\Button.png");
        PZB.isActive = true;
        wurzel.add(PZB);
        
        OKButton okb = new OKButton(700,0,50,"C:\\Users\\ksilb\\OneDrive\\Bilder\\Saved_Pictures\\Button.png");
        okb.isActive = true;
        wurzel.add(okb);
    }
}
