// Max E.

public enum LEHRER
{
    EHRENTHALER     ("Florian Ehrenthaler",     2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "", TexturManager.DATEIPFAD + "Ehrenthaler.png",      ""), 
    ADAM            ("Klaus Baumgartner",       2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "", TexturManager.DATEIPFAD + "Adam.png",             ""), 
    GUST            ("Verena Gust",             2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Gust.png", TexturManager.DATEIPFAD + "Auto_Gust.png", TexturManager.DATEIPFAD + "Gust.png",   ""), 
    SCHMELMER       ("Anton Schmelmer",         2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "", TexturManager.DATEIPFAD + "Schmelmer.png" ,        ""), 
    STUFFER         ("Manuel Stuffer",          2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "", TexturManager.DATEIPFAD + "Stuffer.png" ,         ""),
    PLEYER          ("Christine Pleyer",        2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "Auto_Pleyer.png", TexturManager.DATEIPFAD + "Auto_Pleyer.png", TexturManager.DATEIPFAD + "Pleyer.png" ,      ""),
    LOISTL          ("Florian Loistl",          2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "", TexturManager.DATEIPFAD + "Loistl.png",             ""),
    SAUER           ("Daniel Sauer",            2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "", TexturManager.DATEIPFAD + "Sauer.png" ,            ""),
    TREMMEL         ("Andreas Tremmel",         2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "", TexturManager.DATEIPFAD + "Tremmel.png",          ""),
    WECKER          ("Stefan Wecker",           2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "", TexturManager.DATEIPFAD + "Wecker.png",           "")
    
    
    ;
    
    private LEHRER(String name , float maxSpeed, float acceleration, float deceleration, String dateipfadAuto, String dateipfadIcon, String dateipfadName, String dateipfadZusatz)
    {
        this.NAME = name;
        this.MAXSPEED = maxSpeed;
        this.ACCELERATION = acceleration;
        this.DECELERATION = deceleration;
        this.DATEIPFAD_AUTO = dateipfadAuto;
        this.DATEIPFAD_ICON = dateipfadIcon;
        this.DATEIPFAD_NAME = dateipfadName;
        this.DATEIPFAD_ZUSATZ = dateipfadZusatz;
    }
    
    public final String NAME;
    public final float MAXSPEED;
    public final float ACCELERATION;
    public final float DECELERATION;
    public final String DATEIPFAD_AUTO;
    public final String DATEIPFAD_ICON;
    public final String DATEIPFAD_NAME;
    public final String DATEIPFAD_ZUSATZ;
}