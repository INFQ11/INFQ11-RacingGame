// Max E.

import ea.*;

public class ButtonSammlung
{
    public static void instantiateButtons()
    {
        StartButton st = new StartButton(865,360,130,TexturManager.DATEIPFAD + "StructureButton.png");
        
        MehrspielerButton mb = new MehrspielerButton(350,0,100,TexturManager.DATEIPFAD + "StructureButton.png");
        
        EinzelspielerButton eb = new EinzelspielerButton(700,0,100,TexturManager.DATEIPFAD + "StructureButton.png");
        
        PfeilVorButton PVB = new PfeilVorButton(0,0,50,TexturManager.DATEIPFAD + "StructureButton.png");
        
        PfeilZurückButton PZB = new PfeilZurückButton(350,0,50,TexturManager.DATEIPFAD + "StructureButton.png");
        
        OKButton okb = new OKButton(700,0,50,TexturManager.DATEIPFAD + "StructureButton.png");
    }
}
