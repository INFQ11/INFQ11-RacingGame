import ea.*;

public class Startbildschirm extends Bildschirm
{
    public Startbildschirm()
    {
        int breite = myGame.BREITE;
        int höhe = myGame.HOEHE;
        
        Bild bild = new Bild(0,0,breite, höhe,"D:\\Git Workspace\\Q11_Informatik_Template_Startmenü\\pictures\\Background.jpg");
        wurzel.add(bild);
        
        /**
         * Information: Buttons müssen nun nicht mehr in ButtonSammlung erzeugt
         * oder angemeldet werden!
         */
        
        StartButton st = new StartButton(0,0,0,"");
        st.isActive = true;
        wurzel.add(st);
    }
}
