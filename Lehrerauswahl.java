import ea.*;

public class Lehrerauswahl
{
    Knoten wurzel = new Knoten();
    
    Bild currentIcon;
    Text currentText;
    LEHRER currentLehrer;
    
    LEHRER [] lehrer;
    
    int index;
    
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
        
        currentIcon = new Bild(500,500, 50, lehrer[0].DATEIPFAD_ICON);
        currentText = new Text(500,600, lehrer[0].NAME);
        
        index = 0;
        
        wurzel.add(currentIcon);
        wurzel.add(currentText);
    }

    public void lehrerNachRechts()
    {
        index = (index + 1)%lehrer.length;
        System.out.println(this);
        
        wurzel.entfernen(currentIcon);
        wurzel.entfernen(currentText);
        
        currentIcon = new Bild(0,500, 50, lehrer[index].DATEIPFAD_ICON);
        currentText = new Text(500,500, lehrer[index].NAME);
        
        wurzel.add(currentIcon);
        wurzel.add(currentText);
    }
    
    public Raum getRaum()
    {
        return wurzel;
    }
}
