// Max E.

import ea.*;

public class ButtonSammlung
{
    public static void instantiateButtons()
    {
        StartButton st = new StartButton(865,360,100,TexturManager.DATEIPFAD + "StartButton.png");
        
        MehrspielerButton mb = new MehrspielerButton(350,0,100,TexturManager.DATEIPFAD + "MehrspielerButton.png");
        
        EinzelspielerButton eb = new EinzelspielerButton(700,0,100,TexturManager.DATEIPFAD + "EinspielerButton.png");
        
        PfeilVorButton PVB = new PfeilVorButton(500,680,100,TexturManager.DATEIPFAD + "PfeilVorButton.png");
        
        OKButton okb = new OKButton(550,680,100,TexturManager.DATEIPFAD + "OKButton.png");
    }
}
