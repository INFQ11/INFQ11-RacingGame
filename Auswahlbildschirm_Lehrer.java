/**
 * @Author Konstantin S.
 */

import ea.*;

import java.awt.*;
import java.awt.color.*;
public class Auswahlbildschirm_Lehrer extends Bildschirm
{
    public static Lehrerauswahl lehrerauswahl;
    
    public Auswahlbildschirm_Lehrer()
    {
        Bild background = new Bild(0,0,100,TexturManager.DATEIPFAD + "Einzelspieler.png");
        wurzel.add(background);
        
        ButtonFacade.getButton(ButtonType.OK).setActive(true);
        wurzel.add(ButtonFacade.getButton(ButtonType.OK));
        
        ButtonFacade.getButton(ButtonType.PFEILVOR).setActive(true);
        wurzel.add(ButtonFacade.getButton(ButtonType.PFEILVOR));
        
        Rechteck Rahmen = new Rechteck(800,325,360,350);
        Rahmen.farbeSetzen(Color.ORANGE);
        wurzel.add(Rahmen);

        Rechteck VerzierungOben = new Rechteck(809,336,342,2);
        VerzierungOben.farbeSetzen(Color.RED);
        wurzel.add(VerzierungOben);

        Rechteck VerzierungLinks = new Rechteck(809,336,2,337);
        VerzierungLinks.farbeSetzen(Color.RED);
        wurzel.add(VerzierungLinks);

        Rechteck VerzierungUnten = new Rechteck(809,671,342,2);
        VerzierungUnten.farbeSetzen(Color.RED);
        wurzel.add(VerzierungUnten);

        Rechteck VerzierungRechts = new Rechteck(1149,336,2,337);
        VerzierungRechts.farbeSetzen(Color.RED);
        wurzel.add(VerzierungRechts);
        
        lehrerauswahl = new Lehrerauswahl(820,350,871,330);
        wurzel.add(lehrerauswahl.getRaum());
    }
    
    @Override
    public void tasteReagieren(int tastencode)
    {
        
    }
}
