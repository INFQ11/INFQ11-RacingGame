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
        
        Bild bild = new Bild(0,0,breite, höhe,"");
        wurzel.add(bild);
        
        /**
         * Information: Buttons müssen nun nicht mehr in ButtonSammlung erzeugt
         * oder angemeldet werden!
         */
        
        OKButton okb = new OKButton(0,0,0,"");
        okb.isActive = true;
        wurzel.add(okb);
        
        MehrspielerButton mb = new MehrspielerButton(350,0,0,"");
        mb.isActive = true;
        wurzel.add(mb);
        
        EinzelspielerButton eb = new EinzelspielerButton(700,0,0,"");
        eb.isActive = true;
        wurzel.add(eb);
    }
}
