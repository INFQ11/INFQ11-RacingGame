// Max E. editted by Konstantin S.

import ea.*;

public class ButtonSammlung
{
    public static void instantiateButtons()
    {
        StartButton st = new StartButton(TexturManager.BREITE*0.671875f,TexturManager.HOEHE*0.4888888888f,120,TexturManager.DATEIPFAD + "StartButton.png");
        
        MehrspielerButton mb = new MehrspielerButton(TexturManager.BREITE*0.052083333f,TexturManager.HOEHE*0.25f,85,TexturManager.DATEIPFAD + "MehrspielerButton.png");
        
        EinzelspielerButton eb = new EinzelspielerButton(TexturManager.BREITE*0.052083333f,TexturManager.HOEHE*0.037037037f,85,TexturManager.DATEIPFAD + "EinspielerButton.png");
        
        PfeilVorButton PVB = new PfeilVorButton(TexturManager.BREITE*0.166666666666f,TexturManager.HOEHE*0.4259259259f,100,TexturManager.DATEIPFAD + "PfeilVorButton.png");
        
        OKButton okb = new OKButton(TexturManager.BREITE*0.58333333333333f,TexturManager.HOEHE*0.4259259259f,100,TexturManager.DATEIPFAD + "OKButton.png");

        //SmashButton smb = new SmashButton(1600,0,100,TexturManager.DATEIPFAD + "OKButton.png");

        //PassButton pb = new PassButton(1100,0,100,TexturManager.DATEIPFAD + "PfeilVorButton.png");
    }
}
