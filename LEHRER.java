// Max E.

public enum LEHRER
{
    EHRENTHALER     (1, "Florian Ehrenthaler",     0.75f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Ehrenthaler.png", TexturManager.DATEIPFAD + "ehrenthalerIcon.png",       TexturManager.DATEIPFAD + "Ehrenthaler.png"),
    ADAM            (2, "Franz Adam",              0.75f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Adam.png", TexturManager.DATEIPFAD + "adamIcon.png",              TexturManager.DATEIPFAD + "Adam.png"),
    GUST            (3, "Verena Gust",             0.75f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Gust.png", TexturManager.DATEIPFAD + "gustIcon.png",              TexturManager.DATEIPFAD + "Gust.png"),
    SCHMELMER       (4, "Anton Schmelmer",         0.75f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Schmelmer.png", TexturManager.DATEIPFAD + "schmelmerIcon.png",           TexturManager.DATEIPFAD + "Schmelmer.png"),
    STUFFER         (5, "Manuel Stuffer",          0.75f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Stuffer.png", TexturManager.DATEIPFAD + "stufferIcon.png",           TexturManager.DATEIPFAD + "Stuffer.png"),
    PLEYER          (6, "Christine Pleyer",        0.75f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Pleyer.png",  TexturManager.DATEIPFAD + "pleyerIcon.png",           TexturManager.DATEIPFAD + "Pleyer.png"),
    LOISTL          (7, "Florian Loistl",          0.75f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Loistl.png", TexturManager.DATEIPFAD + "loistlIcon.png",            TexturManager.DATEIPFAD + "Loistl.png"),
    SAUER           (8, "Daniel Sauer",            0.75f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Sauer.png", TexturManager.DATEIPFAD + "sauerIcon.png",             TexturManager.DATEIPFAD + "Sauer.png"),
    TREMMEL         (9, "Andreas Tremmel",         0.75f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Tremmel.png", TexturManager.DATEIPFAD + "tremmelIcon.png",           TexturManager.DATEIPFAD + "Tremmel.png"),
    WECKER          (10,"Stefan Wecker",           0.75f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Wecker.png", TexturManager.DATEIPFAD + "weckerIcon.png",            TexturManager.DATEIPFAD + "Wecker.png")
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