// Max E.

public enum LEHRER
{
    EHRENTHALER     (1, "Florian Ehrenthaler",     2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Ehrenthaler.png", TexturManager.DATEIPFAD + "StructureIcon.png",       TexturManager.DATEIPFAD + "Ehrenthaler.png"),
    ADAM            (2, "Franz Adam",              2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Adam.png", TexturManager.DATEIPFAD + "StructureIcon.png",              TexturManager.DATEIPFAD + "Adam.png"),
    GUST            (3, "Verena Gust",             2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Gust.png", TexturManager.DATEIPFAD + "StructureIcon.png",              TexturManager.DATEIPFAD + "Gust.png"),
    SCHMELMER       (4, "Anton Schmelmer",         2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Schmelmer.png", TexturManager.DATEIPFAD + "StructureIcon.png",           TexturManager.DATEIPFAD + "Schmelmer.png"),
    STUFFER         (5, "Manuel Stuffer",          2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Stuffer.png", TexturManager.DATEIPFAD + "StructureIcon.png",           TexturManager.DATEIPFAD + "Stuffer.png"),
    PLEYER          (6, "Christine Pleyer",        2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Pleyer.png",  TexturManager.DATEIPFAD + "StructureIcon.png",           TexturManager.DATEIPFAD + "Pleyer.png"),
    LOISTL          (7, "Florian Loistl",          2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Loistl.png", TexturManager.DATEIPFAD + "StructureIcon.png",            TexturManager.DATEIPFAD + "Loistl.png"),
    SAUER           (8, "Daniel Sauer",            2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Sauer.png", TexturManager.DATEIPFAD + "StructureIcon.png",             TexturManager.DATEIPFAD + "Sauer.png"),
    TREMMEL         (9, "Andreas Tremmel",         2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Tremmel.png", TexturManager.DATEIPFAD + "StructureIcon.png",           TexturManager.DATEIPFAD + "Tremmel.png"),
    WECKER          (10,"Stefan Wecker",           2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Wecker.png", TexturManager.DATEIPFAD + "StructureIcon.png",            TexturManager.DATEIPFAD + "Wecker.png")
    ;
    
    private LEHRER(int ID, String name , float maxSpeed, float acceleration, float deceleration, String dateipfadAuto, String dateipfadIcon, String dateipfadName)
    {
        this.ID = ID;
        this.NAME = name;
        this.MAXSPEED = maxSpeed;
        this.ACCELERATION = acceleration;
        this.DECELERATION = deceleration;
        this.DATEIPFAD_AUTO = dateipfadAuto;
        this.DATEIPFAD_ICON = dateipfadIcon;
        this.DATEIPFAD_NAME = dateipfadName;
    }
    
    public final int ID;
    public final String NAME;
    public final float MAXSPEED;
    public final float ACCELERATION;
    public final float DECELERATION;
    public final String DATEIPFAD_AUTO;
    public final String DATEIPFAD_ICON;
    public final String DATEIPFAD_NAME;
}