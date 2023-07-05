import ea.*;
/**
 * @Author: Konstantin S.
 */
public class Hilfe extends Bildschirm
{
    private String Line[] = new String[25];
    private String completeText = "";
    public void newArray()
    {
        Line[0] = "Herzlich Willkommen sehr verehrter Adept!";
        Line[1] = "";
        Line[2] = "Mit Verlaub bedanken wir uns bei Ihnen, dass Sie sich dazu entschieden haben, dieses Spiel zu selegieren.";
        Line[3] = "Im Folgenden wird Ihnen eine Instruktion dargeboten, mit welcher Sie es vermögen werden folgendes Spiel in Genuss zu erfahren.";
        Line[4] = "I. Um Ihre Computer-Maus zu mobilisieren, bitten wir Sie hochachtungsvoll auf Ihrem Tastenwerk die Taste „M“ zu erlesen.";
        Line[5] = "II. Anschließend wird Ihnen die Möglichkeit präsentiert, den Startbutton zu betätigen.";
        Line[6] = "III. Ist diese Hürde genommen, stellt sich Ihnen die Chance dar,";
        Line[7] = "die Spieleranzahl mit den Auswahlflächen „Einzelspieler“ und „Mehrspieler“ zu bestimmen.";
        Line[8] = "IV. Ist dies gemeistert, werden Sie förmlichst dazu aufgefordert, einen Magister zu bestimmen, der Ihr Verlangen stimuliert.";
        Line[9] = "Dies können Sie wahrnehmen, indem Sie auf die bereitgestellte Hilfe der „Pass-Taste“ zugreifen.";
        Line[10] = "Durch die Betätigung von jener werden Ihnen zahlreiche Auswahlmöglichkeiten vorgeführt unter jenen Sie wählen können.";
        Line[11] = "Ist Ihr Votum abgeschlossen wird Ihnen die Gelegenheit bereitgestellt durch Betätigen der „Smash-Taste“ Ihre Wahl zu untermauern.";
        Line[12] = "V. Darauffolgend sollten Sie visuell wahrnehmen, dass Sie sich mit Ihrem ausgewählten Personenkraftwagen auf einer Startposition einer Rennstrecke wiederfinden.";
        Line[13] = "Nach der Realisierung der Situation wird ein Countdown in Ihr Sichtfeld geraten.";
        Line[14] = "VI. Ist dieser abgelaufen, wird Ihnen die Möglichkeit bereitgestellt durch das Betätigen gewisser Tasten Ihr Renngefährt zu steuern. Um Geschwindigkeit zu erreichen ist es von Nöten die Taste „W“ zu betätigen. Verspüren Sie jedoch den Wunsch Ihr Gefährt zu verlangsamen oder in gegenteilige Richtung zu beschleunigen, legen wir Ihnen nahe „S“ zu betätigen. Möchten Sie die Ausrichtung des Fahrzeugs ändern, können Sie das mit „A“ und „D“ realisieren.";
        Line[15] = "VII. Während Sie sich im Wettstreit befinden, werden immer wieder herausfordernde Fragen auf Ihrem Bildschirm erscheinen. Kurze Zeit später erscheinen auf der Strecke drei Auswahlmöglichkeiten, mit welchen Sie Ihre Antwort unterstreichen können. Haben Sie die Leistung vollbracht die korrekte Antwort zu bestimmen, erhalten sie einen Zähler. Versagen Sie jedoch bleibt Ihnen diese Leistung verweigert.";
        Line[16] = "VIII. Nachdem der Rennspaß zu neige gegangen ist, wird der Spieler ausgezeichnet, dessen Zeit und erreichte Punkte in der Gesamtwertung überlegen sind.";
        Line[17] = "";
        Line[18] = "";
        Line[19] = "Der gesamte Informatikkurs wünscht Ihnen VIEL FREUDE beim Exerzieren dieses Produktes.";
        
        
    }
    
    
    public Hilfe()
    {
        Text Ueberschrift = new Text(800,20,50,"Spielanleitung ");
        wurzel.add(Ueberschrift);
        newArray();
        Text Anleitung1 = new Text(50,130,30,Line[0]);
        wurzel.add(Anleitung1);
        Text Anleitung2 = new Text(50,180,30,Line[1]);
        wurzel.add(Anleitung2);
        Text Anleitung3 = new Text(50,230,30,Line[2]);
        wurzel.add(Anleitung3);
        Text Anleitung4 = new Text(50,280,30,Line[3]);
        wurzel.add(Anleitung4);
        Text Anleitung5 = new Text(50,330,30,Line[4]);
        wurzel.add(Anleitung5);
        Text Anleitung6 = new Text(50,380,30,Line[5]);
        wurzel.add(Anleitung6);
        Text Anleitung7 = new Text(50,430,30,Line[6]);
        wurzel.add(Anleitung7);
        Text Anleitung8 = new Text(50,480,30,Line[7]);
        wurzel.add(Anleitung8);
    }

    public void tasteReagieren(int tastencode)
    {
        
    }
}

