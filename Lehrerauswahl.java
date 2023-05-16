import ea.*;

public class Lehrerauswahl
{
    Knoten wurzel = new Knoten();
    
    Bild currentIcon;
    Text currentText;
    Text currentZusatz;
    
    LEHRER currentLehrer;
    
    LEHRER [] lehrer;
    
    int index;
    
    private final int xBild = 500;
    private final int yBild = 400;
    private final int xText = 500;
    private final int yText = 550;
    private final int xZusatz = 500;
    private final int yZusatz = 600;
    
    public Lehrerauswahl()
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
        
        currentIcon = new Bild(xBild,yBild, 50, lehrer[0].DATEIPFAD_ICON);
        currentText = new Text(xText,yText, lehrer[0].NAME);
        currentZusatz = new Text(xZusatz, yZusatz, lehrer[0].ZUSATZ);
        
        index = 0;
        
        wurzel.add(currentIcon);
        wurzel.add(currentText);
        wurzel.add(currentZusatz);
    }

    public void lehrerNachRechts()
    {
        index = (index + 1)%lehrer.length;
        
        wurzel.entfernen(currentIcon);
        wurzel.entfernen(currentText);
        
        currentIcon = new Bild(xBild,yBild, 50, lehrer[index].DATEIPFAD_ICON);
        currentText = new Text(xText,yText, lehrer[index].NAME);
        currentZusatz = new Text(xZusatz, yZusatz, lehrer[index].ZUSATZ);
        
        wurzel.add(currentIcon);
        wurzel.add(currentText);
        wurzel.add(currentZusatz);
    }
    
    public Raum getRaum()
    {
        return wurzel;
    }
}
