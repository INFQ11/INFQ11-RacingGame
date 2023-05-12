/**
 * @Author Konstantin S.
 */

import ea.*;

public class Startbildschirm extends Bildschirm
{
    public Startbildschirm()
    {
        int breite = TexturManager.BREITE;
        int höhe = TexturManager.HOEHE;
        
        Bild bild = new Bild(0,0,breite, höhe,"C:\\Users\\ksilb\\OneDrive\\Dokumente\\Schule\\Info Projekt\\+libs\\Bilder\\Startbildschirm.jpg");
        wurzel.add(bild);
        
        StartButton st = new StartButton(865,360,130,"C:\\Users\\ksilb\\OneDrive\\Dokumente\\Schule\\Info Projekt\\+libs\\Bilder\\Buttons\\Startbutton.png");
        st.isActive = true;
        wurzel.add(st);
    }
    
    @Override
    public void tasteReagieren(int tastencode)
    {
        
    }
}
