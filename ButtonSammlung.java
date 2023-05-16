// Max E.

import ea.*;

public class ButtonSammlung
{
    public static void instantiateButtons()
    {
        StartButton st = new StartButton(865,360,130,TexturManager.DATEIPFAD + "StartButton.png");
        
        MehrspielerButton mb = new MehrspielerButton(350,0,100,TexturManager.DATEIPFAD + "MehrspielerButton.png");
        
        EinzelspielerButton eb = new EinzelspielerButton(700,0,100,TexturManager.DATEIPFAD + "EinzelspielerButton.png");
        
        PfeilVorButton PVB = new PfeilVorButton(0,0,50,TexturManager.DATEIPFAD + "PfeilVorButton.png");
        
        OKButton okb = new OKButton(700,0,50,TexturManager.DATEIPFAD + "OKButton.png");
    }
}
