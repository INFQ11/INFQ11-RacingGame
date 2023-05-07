import ea.*;

public class Startbildschirm extends Bildschirm
{
    public Startbildschirm()
    {
        int breite = myGame.BREITE;
        int höhe = myGame.HOEHE;
        
        Bild bild = new Bild(0,0,breite, höhe,"C:\\Users\\ksilb\\OneDrive\\Bilder\\Saved_Pictures\\Hintergrung.jpeg");
        wurzel.add(bild);
        
        /**
         * Information: Buttons müssen nun nicht mehr in ButtonSammlung erzeugt
         * oder angemeldet werden!
         */
        
        StartButton st = new StartButton(0,0,0,"C:\\Users\\ksilb\\OneDrive\\Bilder\\Saved_Pictures\\Button.png");
        st.isActive = true;
        wurzel.add(st);
    }
}
