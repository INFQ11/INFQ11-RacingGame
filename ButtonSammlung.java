// Max E.

import ea.*;

public class ButtonSammlung
{
    public static void instantiateButtons()
    {
        StartButton st = new StartButton(863,355,135,TexturManager.DATEIPFAD + "StartButton.png");
        
        MehrspielerButton mb = new MehrspielerButton(100,250,125,TexturManager.DATEIPFAD + "MehrspielerButton.png");
        
        EinzelspielerButton eb = new EinzelspielerButton(65,40,95,TexturManager.DATEIPFAD + "EinspielerButton.png");
        
        PfeilVorButton PVB = new PfeilVorButton(100,0,100,TexturManager.DATEIPFAD + "PfeilVorButton.png");
        
        OKButton okb = new OKButton(600,0,100,TexturManager.DATEIPFAD + "OKButton.png");

        //SmashButton smb = new SmashButton(1600,0,100,TexturManager.DATEIPFAD + "OKButton.png");

        //PassButton pb = new PassButton(1100,0,100,TexturManager.DATEIPFAD + "PfeilVorButton.png");
    }
}
