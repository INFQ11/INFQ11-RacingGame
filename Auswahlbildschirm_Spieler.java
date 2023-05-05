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
        
        Bild bild = new Bild(0,0,breite, höhe,"D:\\Git Workspace\\Q11_Informatik_Template_Startmenü\\pictures\\Background.jpg");
        wurzel.add(bild);
        
        /**
         * Information: Buttons müssen nun nicht mehr in ButtonSammlung erzeugt
         * oder angemeldet werden!
         */
        
        OKButton okb = new OKButton(0,0,0,"");
        okb.isActive = true;
        wurzel.add(okb);
    }
}
