// Max E.

import ea.*;

public class ButtonSammlung
{
    public static void instantiateButtons()
    {
        StartButton st = new StartButton(865,360,130,TexturManager.DATEIPFAD + "StructureButton.png");
        ButtonVerwaltung.getInstance().buttonAnmelden(st);
        
        MehrspielerButton mb = new MehrspielerButton(350,0,100,TexturManager.DATEIPFAD + "StructureButton.png");
        ButtonVerwaltung.getInstance().buttonAnmelden(mb);
        
        EinzelspielerButton eb = new EinzelspielerButton(700,0,100,TexturManager.DATEIPFAD + "StructureButton.png");
        ButtonVerwaltung.getInstance().buttonAnmelden(eb);
        
        PfeilVorButton PVB = new PfeilVorButton(0,0,50,TexturManager.DATEIPFAD + "StructureButton.png");
        ButtonVerwaltung.getInstance().buttonAnmelden(PVB);
        
        PfeilZurückButton PZB = new PfeilZurückButton(350,0,50,TexturManager.DATEIPFAD + "StructureButton.png");
        ButtonVerwaltung.getInstance().buttonAnmelden(PZB);
        
        OKButton okb = new OKButton(700,0,50,TexturManager.DATEIPFAD + "StructureButton.png");
        ButtonVerwaltung.getInstance().buttonAnmelden(okb);
    }
}
