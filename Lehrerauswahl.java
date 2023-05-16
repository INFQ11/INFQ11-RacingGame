import ea.*;

public class Lehrerauswahl
{
    Knoten wurzel = new Knoten();
    
    Bild currentIcon;
    Bild currentName;
    Bild currentZusatz;
    
    LEHRER currentLehrer;
    
    LEHRER [] lehrer;
    
    int index;
    
    private int xIcon;
    private int yIcon;
    private int xName;
    private int yName;
    private int xZusatz;
    private int yZusatz;
    
    public Lehrerauswahl(int xBild, int yBild, int xText, int yText, int xZusatz, int yZusatz)
    {
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
        
     
           
        if (xBild < 0)
        {
                xIcon = 500;
                yIcon = 400;
               xName = 500;
               yName = 550;
               xZusatz = 500;
                yZusatz = 600;
        }
        
        currentIcon = new Bild(xIcon,yIcon, 50, lehrer[0].DATEIPFAD_ICON);
        currentName = new Bild(xName,yName, 50, lehrer[0].DATEIPFAD_NAME);
        if ( !lehrer[index].DATEIPFAD_ZUSATZ.isBlank() ) 
            currentZusatz = new Bild(xZusatz,yZusatz, 50, lehrer[0].DATEIPFAD_ZUSATZ);
        
        index = 0;
        
        wurzel.add(currentIcon);
        wurzel.add(currentName);
        if (!lehrer[index].DATEIPFAD_ZUSATZ.isBlank()) wurzel.add(currentZusatz);
    }

    public void lehrerNachRechts()
    {
        index = (index + 1)%lehrer.length;
        
        wurzel.entfernen(currentIcon);
        wurzel.entfernen(currentName);
        if (!lehrer[index].DATEIPFAD_ZUSATZ.isBlank())wurzel.entfernen(currentZusatz);
        
        currentIcon = new Bild(xIcon,yIcon, 50, lehrer[index].DATEIPFAD_ICON);
        currentName = new Bild(xName,yName, 50, lehrer[index].DATEIPFAD_NAME);
        if (!lehrer[index].DATEIPFAD_ZUSATZ.isBlank())currentZusatz = new Bild(xZusatz,yZusatz, 50, lehrer[index].DATEIPFAD_ZUSATZ);;
        
        wurzel.add(currentIcon);
        wurzel.add(currentName);
        if (!lehrer[index].DATEIPFAD_ZUSATZ.isBlank())wurzel.add(currentZusatz);
    }
    
    public Raum getRaum()
    {
        return wurzel;
    }
}
