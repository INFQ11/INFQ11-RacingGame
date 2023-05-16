// Max E.

public enum LEHRER
{
    EHRENTHALER ("Florian Ehrenthaler", 2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "StructureCar.png"), 
    ADAM ("Klaus Baumgartner",   2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "StructureCar.png"), 
    GUST        ("Verena Gust",         2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "StructureCar.png"), 
    SCHMELMER     ("Christiane Neumann",  2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "StructureCar.png"), 
    STUFFER    ("Karl Schlattl",       2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "StructureCar.png"),
    PLEYER ("Karl Schlattl",       2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "StructureCar.png"),
    LOISTL ("Karl Schlattl",       2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "StructureCar.png"),
    SAUER ("Karl Schlattl",       2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "StructureCar.png"),
    TREMMEL ("Karl Schlattl",       2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "StructureCar.png"),
    WECKER ("Karl Schlattl",       2f, 0.0001f, 0.0001f, TexturManager.DATEIPFAD + "StructureCar.png", TexturManager.DATEIPFAD + "StructureCar.png")
    
    
    ;
    
    private LEHRER(String name, float maxSpeed, float acceleration, float deceleration, String dateipfadAuto, String dateipfadIcon)
    {
        this.NAME = name;
        this.MAXSPEED = maxSpeed;
        this.ACCELERATION = acceleration;
        this.DECELERATION = deceleration;
        this.DATEIPFAD_AUTO = dateipfadAuto;
        this.DATEIPFAD_ICON = dateipfadIcon;
    }
    
    public final String NAME;
    public final float MAXSPEED;
    public final float ACCELERATION;
    public final float DECELERATION;
    public final String DATEIPFAD_AUTO;
    public final String DATEIPFAD_ICON;
}