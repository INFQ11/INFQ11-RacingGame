import ea.*;
/**
 * @author: Konstantin S. 
 */
public class Ende extends Bildschirm
{
    private String Line[] = new String[8];
    public Ende()
    {
        myGame.getInstance().getCam().positionSetzen(new Punkt(0,0));
        //Bild Hintergrund = new Bild(0,0,100,TexturManager.DATEIPFAD + "EndBildschirm.png");
        
        newArray();
        Text Überschrift = new Text(300,200,50,Line[0]);
        wurzel.add(Überschrift);
        Text t1 = new Text(200,300,20,Line[1]);
        wurzel.add(t1);
        Text t2 = new Text(200,340,20,Line[2]);
        wurzel.add(t2);
        Text t3 = new Text(200,380,20,Line[3]);
        wurzel.add(t3);
        Text t4 = new Text(200,420,20,Line[4]);
        wurzel.add(t4);
        Text t5 = new Text(200,460,20,Line[5]);
        wurzel.add(t5);
        Text score = new Text(600,120,50,Line[6]);
        wurzel.add(score);
        Text info = new Text(200, 500, 20, Line[7]);
        wurzel.add(info);
    }

    public void newArray()
    {
        Line[0] = "Herzlichen Glückwunsch, Adept!";
        Line[1] = "Der gesamte Informatikkurs schüttet Ihnen ihre größten Gratulationen aus!";
        Line[2] = "Jeder von uns ist aus Erfurcht vor ihren Leistungen erstarrt!";
        Line[3] = "Im oberen, mittleren Segment des Bildschirms können Sie ihre Punktzahl des zuletzt absolvierten Laufs betrachten!";
        Line[4] = "Wenn sie zu versuchen vermögen, ihren erspielten Punktestand für ein noch besseres Ergebnis auszutauschen, steht es ihnen frei, die Leertaste zu betätigen und das Spiel erneut zu exerzieren.";
        Line[5] = "Sollten Sie jedoch den Genuss beenden wollen, können Sie das mithilfe der „esc“-Taste verwirklichen und das Spiel verlassen.";
        Line[6] = "Ihre Punktzahl: " + (SteuerungFacade.getStoppuhr().getResult() - 4*QuestionController.getCorrectAnswers());
        Line[7] = "Info: Die Punktzahl errechnet sich aus erreichter Zeit und richtigen Antworten --> Kleinerer Score = gut";
    }
    
    public void tasteReagieren(int tastencode)
    {
        if (tastencode == 30) {
            myGame.getInstance().beenden();
            myGame.initNewInstance();
        }
    }
}
