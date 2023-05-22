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
    private int xZusatz;
    private int yZusatz;
    
    public Lehrerauswahl(int xIcon, int yIcon, int xName, int yName, int xZusatz, int yZusatz)
    {
        this.xIcon = xIcon;
        this.yIcon = yIcon;
        this.xName = xName;
        this.yName = yName;
        this.xZusatz = xZusatz;
        this.yZusatz = yZusatz;
        
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
        
        index = 2;
        
        currentIcon = new Bild(xIcon,yIcon, 100, lehrer[index].DATEIPFAD_ICON);
        currentName = new Bild(xName,yName, 100, lehrer[index].DATEIPFAD_NAME);
        
        if ( !lehrer[index].DATEIPFAD_ZUSATZ.isBlank() ) 
            {
                currentZusatz = new Bild(xZusatz,yZusatz, 50, lehrer[index].DATEIPFAD_ZUSATZ);
                wurzel.add(currentZusatz);
            }
        
        
        wurzel.add(currentIcon);
        wurzel.add(currentName);
    }

    public void lehrerNachRechts()
    {
        index = (index + 1)%lehrer.length;
        
        wurzel.entfernen(currentIcon);
        wurzel.entfernen(currentName);
        
        if (!lehrer[index].DATEIPFAD_ZUSATZ.isBlank())
        {
            wurzel.entfernen(currentZusatz);
            currentZusatz = new Bild(xZusatz,yZusatz, 100, lehrer[index].DATEIPFAD_ZUSATZ);
            wurzel.add(currentZusatz);
        }
    
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
