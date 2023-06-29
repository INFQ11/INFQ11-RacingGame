// Max E.

import ea.*;

public class ButtonSammlung
{
    public static void instantiateButtons()
    {
        StartButton st = new StartButton(TexturManager.BREITE*0.671875f,528,120,TexturManager.DATEIPFAD + "StartButton.png");
        
        MehrspielerButton mb = new MehrspielerButton(100,270,85,TexturManager.DATEIPFAD + "MehrspielerButton.png");
        
        EinzelspielerButton eb = new EinzelspielerButton(100,40,85,TexturManager.DATEIPFAD + "EinspielerButton.png");
        
        PfeilVorButton PVB = new PfeilVorButton(320,460,100,TexturManager.DATEIPFAD + "PfeilVorButton.png");
        
        OKButton okb = new OKButton(1120,460,100,TexturManager.DATEIPFAD + "OKButton.png");

        //SmashButton smb = new SmashButton(1600,0,100,TexturManager.DATEIPFAD + "OKButton.png");

        //PassButton pb = new PassButton(1100,0,100,TexturManager.DATEIPFAD + "PfeilVorButton.png");
    }
}
