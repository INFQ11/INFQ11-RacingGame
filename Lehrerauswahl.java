import ea.*;

public class Lehrerauswahl
{
    private Knoten wurzel = new Knoten();
    
    private Bild currentIcon;
    private Bild currentName;
    private Bild currentZusatz;
    
    private LEHRER currentLehrer;
    
    private LEHRER [] lehrer;
    
    private int index;
    
    private int xIcon;
    private int yIcon;
    private int xName;
    private int yName;
    
    public Lehrerauswahl(int xIcon, int yIcon, int xName, int yName)
    {
        this.xIcon = xIcon;
        this.yIcon = yIcon;
        this.xName = xName;
        this.yName = yName;
        
        lehrer = new LEHRER [10];
        
        lehrer[0] = LEHRER.EHRENTHALER;
        lehrer[1] = LEHRER.ADAM;
        lehrer[2] = LEHRER.GUST;
        lehrer[3] = LEHRER.SCHMELMER;
        lehrer[4] = LEHRER.STUFFER;
        lehrer[5] = LEHRER.PLEYER;
        lehrer[6] = LEHRER.LOISTL;
        lehrer[7] = LEHRER.SAUER;
        lehrer[8] = LEHRER.TREMMEL;
        lehrer[9] = LEHRER.WECKER;
        
        index = 0;
        
        currentIcon = new Bild(xIcon,yIcon, 100, lehrer[index].DATEIPFAD_ICON);
        currentName = new Bild(xName,yName, 100, lehrer[index].DATEIPFAD_NAME);
        
        wurzel.add(currentIcon);
        wurzel.add(currentName);
    }
    
    public void lehrerNachRechts()
    {
        index = (index + 1)%lehrer.length;
        
        wurzel.entfernen(currentIcon);
        wurzel.entfernen(currentName);
    
        currentIcon = new Bild(xIcon,yIcon, 100, lehrer[index].DATEIPFAD_ICON);
        currentName = new Bild(xName,yName, 100, lehrer[index].DATEIPFAD_NAME);
        
        wurzel.add(currentIcon);
        wurzel.add(currentName);
    }
    
    public Raum getRaum()
    {
        return wurzel;
    }
}
