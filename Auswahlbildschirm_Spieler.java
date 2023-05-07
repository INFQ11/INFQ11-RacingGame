/**
 * @Author Konsti S.
 */
import ea.*;

public class Auswahlbildschirm_Spieler extends Bildschirm
{
    public Auswahlbildschirm_Spieler()
    {
        int breite = myGame.BREITE;
        int höhe = myGame.HOEHE;
        
        Bild bild = new Bild(0,0,breite, höhe,"C:\\Users\\ksilb\\OneDrive\\Bilder\\Saved_Pictures\\Sternentstehung.jpg");
        wurzel.add(bild);
        
        /**
         * Information: Buttons müssen nun nicht mehr in ButtonSammlung erzeugt
         * oder angemeldet werden!
         */
        
        OKButton okb = new OKButton(0,0,0,"C:\\Users\\ksilb\\OneDrive\\Bilder\\Saved_Pictures\\Button.png");
        okb.isActive = true;
        wurzel.add(okb);
        
        MehrspielerButton mb = new MehrspielerButton(350,0,0,"C:\\Users\\ksilb\\OneDrive\\Bilder\\Saved_Pictures\\Button.png");
        mb.isActive = true;
        wurzel.add(mb);
        
        EinzelspielerButton eb = new EinzelspielerButton(700,0,0,"C:\\Users\\ksilb\\OneDrive\\Bilder\\Saved_Pictures\\Button.png");
        eb.isActive = true;
        wurzel.add(eb);
    }
}
