// Max E.

public enum LEHRER
{
    EHRENTHALER     ("Florian Ehrenthaler",     2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Ehrenthaler.png", TexturManager.DATEIPFAD + "StructureIcon.png",       TexturManager.DATEIPFAD + "Ehrenthaler.png"),
    ADAM            ("Franz Adam",              2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Adam.png", TexturManager.DATEIPFAD + "StructureIcon.png",              TexturManager.DATEIPFAD + "Adam.png"),
    GUST            ("Verena Gust",             2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Gust.png", TexturManager.DATEIPFAD + "StructureIcon.png",              TexturManager.DATEIPFAD + "Gust.png"),
    SCHMELMER       ("Anton Schmelmer",         2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Schmelmer.png", TexturManager.DATEIPFAD + "StructureIcon.png",         TexturManager.DATEIPFAD + "Schmelmer.png"),
    STUFFER         ("Manuel Stuffer",          2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Stuffer.png", TexturManager.DATEIPFAD + "StructureIcon.png",           TexturManager.DATEIPFAD + "Stuffer.png"),
    PLEYER          ("Christine Pleyer",        2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Pleyer.png",  TexturManager.DATEIPFAD + "StructureIcon.png",           TexturManager.DATEIPFAD + "Pleyer.png"),
    LOISTL          ("Florian Loistl",          2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Loistl.png", TexturManager.DATEIPFAD + "StructureIcon.png",            TexturManager.DATEIPFAD + "Loistl.png"),
    SAUER           ("Daniel Sauer",            2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Sauer.png", TexturManager.DATEIPFAD + "StructureIcon.png",             TexturManager.DATEIPFAD + "Sauer.png"),
    TREMMEL         ("Andreas Tremmel",         2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Tremmel.png", TexturManager.DATEIPFAD + "StructureIcon.png",           TexturManager.DATEIPFAD + "Tremmel.png"),
    WECKER          ("Stefan Wecker",           2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Wecker.png", TexturManager.DATEIPFAD + "StructureIcon.png",            TexturManager.DATEIPFAD + "Wecker.png")
    
    
    ;
    
    private LEHRER(String name , float maxSpeed, float acceleration, float deceleration, String dateipfadAuto, String dateipfadIcon, String dateipfadName)
    {
        this.NAME = name;
        this.MAXSPEED = maxSpeed;
        this.ACCELERATION = acceleration;
        this.DECELERATION = deceleration;
        this.DATEIPFAD_AUTO = dateipfadAuto;
        this.DATEIPFAD_ICON = dateipfadIcon;
        this.DATEIPFAD_NAME = dateipfadName;
    }
    
    public final String NAME;
    public final float MAXSPEED;
    public final float ACCELERATION;
    public final float DECELERATION;
    public final String DATEIPFAD_AUTO;
    public final String DATEIPFAD_ICON;
    public final String DATEIPFAD_NAME;
}