/**
 * @Author Konstantin S.
 */

import ea.*;

public class Auswahlbildschirm_Spieler extends Bildschirm
{
    public Auswahlbildschirm_Spieler()
    {
        int breite = TexturManager.BREITE;
        int höhe = TexturManager.HOEHE;
        
        Bild bild = new Bild(0,0,breite, höhe,"C:\\Users\\ksilb\\OneDrive\\Dokumente\\Schule\\Info Projekt\\+libs\\Bilder\\Startbildschirm.jpg");
        wurzel.add(bild);
        
        MehrspielerButton mb = new MehrspielerButton(350,0,100,"C:\\Users\\ksilb\\OneDrive\\Dokumente\\Schule\\Info Projekt\\+libs\\Bilder\\Buttons\\Einspielerbutton.png");
        mb.isActive = true;
        wurzel.add(mb);
        
        EinzelspielerButton eb = new EinzelspielerButton(700,0,100,"C:\\Users\\ksilb\\OneDrive\\Dokumente\\Schule\\Info Projekt\\+libs\\Bilder\\Buttons\\Mehrspielerbutton.png");
        eb.isActive = true;
        wurzel.add(eb);
    }
    
    @Override
    public void tasteReagieren(int tastencode)
    {
        
    }
}
