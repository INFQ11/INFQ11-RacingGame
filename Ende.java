import ea.*;
/**
 * @author: Konstantin S. 
 */
public class Ende extends Bildschirm
{
    private String Line[] = new String[7];
    public Ende()
    {
        Bild Hintergrund = new Bild(0,0,100,TexturManager.DATEIPFAD + "EndBildschirm.png");
        
        newArray();
        Text Überschrift = new Text(300,200,50,Line[0]);
        Text t1 = new Text(200,300,20,Line[1]);
        Text t2 = new Text(200,340,20,Line[2]);
        Text t3 = new Text(200,380,20,Line[3]);
        Text t4 = new Text(200,420,20,Line[4]);
        Text t5 = new Text(200,460,20,Line[5]);
        Text score = new Text(600,150,15,Line[6]);
    }

    public void newArray()
    {
        Line[0] = "Herzlichen Glückwunsch Adept!";
        Line[1] = "Der gesamte Informatikkurs schüttet ihnen ihre größten Gratulationen aus!";
        Line[2] = "Jeder von uns ist aus Erfurcht vor ihren Leistungen erstarrt!";
        Line[3] = "Im oberen, mittleren Segment des Bildschirms können sie ihre Punktzahl des zuletzt absolvierten Laufs betrachten!";
        Line[4] = "Wenn sie zu versuchen vermögen, ihren erspielten Punktestand für ein noch besseres Ergebnis auszutauschen, steht es ihnen frei, den Startknopf zu drücken und das Spiel erneut zu exerzieren.";
        Line[5] = "Sollten sie jedoch den Genuss beenden wollen, können sie das mithilfe der „esc“-Taste verwirklichen und das Spiel verlassen.";
        Line[6] = "Deine Punktzahl:";
    }
    
    public void tasteReagieren(int tastencode)
    {
    }
}
