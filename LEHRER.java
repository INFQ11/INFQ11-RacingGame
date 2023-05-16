// Max E.

public enum LEHRER
{
    EHRENTHALER     ("Florian Ehrenthaler", "Zusatz", 2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "StructureCar.png"), 
    ADAM            ("Klaus Baumgartner",   "", 2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "StructureCar.png"), 
    GUST            ("Verena Gust",         "", 2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "StructureCar.png"), 
    SCHMELMER       ("Anton Schmelmer",     "", 2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "StructureCar.png"), 
    STUFFER         ("Manuel Stuffer",      "", 2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "StructureCar.png"),
    PLEYER          ("Christine Pleyer",    "", 2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "StructureCar.png"),
    LOISTL          ("Florian Loistl",      "", 2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "StructureCar.png"),
    SAUER           ("Daniel Sauer",        "", 2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "StructureCar.png"),
    TREMMEL         ("Andreas Tremmel",     "", 2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "StructureCar.png"),
    WECKER          ("Stefan Wecker",       "", 2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "StructureCar.png")
    
    
    ;
    
    private LEHRER(String name, String zusatz, float maxSpeed, float acceleration, float deceleration, String dateipfadAuto, String dateipfadIcon)
    {
        this.NAME = name;
        this.ZUSATZ = zusatz;
        this.MAXSPEED = maxSpeed;
        this.ACCELERATION = acceleration;
        this.DECELERATION = deceleration;
        this.DATEIPFAD_AUTO = dateipfadAuto;
        this.DATEIPFAD_ICON = dateipfadIcon;
    }
    
    public final String NAME;
    public final String ZUSATZ;
    public final float MAXSPEED;
    public final float ACCELERATION;
    public final float DECELERATION;
    public final String DATEIPFAD_AUTO;
    public final String DATEIPFAD_ICON;
}