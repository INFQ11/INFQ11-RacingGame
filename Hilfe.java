import ea.*;
/**
 * @Author: Konstantin S.
 */
public class Hilfe extends Bildschirm
{
    private String Line[] = new String[23];

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
        Line[14] = "VI. Ist dieser abgelaufen, wird Ihnen die Möglichkeit bereitgestellt durch das Betätigen gewisser Tasten Ihr Renngefährt zu steuern.";
        Line[15] = "Um Geschwindigkeit zu erreichen ist es von Nöten die Taste „W“ zu betätigen. Verspüren Sie jedoch den Wunsch Ihr Gefährt zu verlangsamen oder in gegenteilige Richtung zu beschleunigen,";
        Line[16] = "legen wir Ihnen nahe „S“ zu betätigen. Möchten Sie die Ausrichtung des Fahrzeugs ändern, können Sie das mit „A“ und „D“ realisieren.";
        Line[17] = "VII. Während Sie sich im Wettstreit befinden, werden immer wieder herausfordernde Fragen auf Ihrem Bildschirm erscheinen. Kurze Zeit später erscheinen auf der Strecke drei Auswahlmöglichkeiten,";
        Line[18] = "mit welchen Sie Ihre Antwort unterstreichen können. Haben Sie die Leistung vollbracht die korrekte Antwort zu bestimmen, erhalten sie einen Zähler.";
        Line[19] = "Versagen Sie jedoch bleibt Ihnen diese Leistung verweigert.";
        Line[20] = "VIII. Nachdem der Rennspaß zu neige gegangen ist, wird der Spieler ausgezeichnet, dessen Zeit und erreichte Punkte in der Gesamtwertung überlegen sind.";
        Line[21] = "";
        Line[22] = "";
        Line[23] = "Der gesamte Informatikkurs wünscht Ihnen VIEL FREUDE beim Exerzieren dieses Produktes.";
        
        
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
        Text Anleitung9 = new Text(50,530,30,Line[8]);
        wurzel.add(Anleitung9);
        Text Anleitung10 = new Text(50,580,30,Line[9]);
        wurzel.add(Anleitung10);
        Text Anleitung11 = new Text(50,630,30,Line[10]);
        wurzel.add(Anleitung11);
        Text Anleitung12 = new Text(50,680,30,Line[11]);
        wurzel.add(Anleitung12);
        Text Anleitung13 = new Text(50,730,30,Line[12]);
        wurzel.add(Anleitung13);
        Text Anleitung14 = new Text(50,780,30,Line[13]);
        wurzel.add(Anleitung14);
        Text Anleitung15 = new Text(50,830,30,Line[14]);
        wurzel.add(Anleitung15);
        Text Anleitung16 = new Text(50,880,30,Line[15]);
        wurzel.add(Anleitung16);
        Text Anleitung17 = new Text(50,930,30,Line[16]);
        wurzel.add(Anleitung17);
        Text Anleitung18 = new Text(50,980,30,Line[17]);
        wurzel.add(Anleitung18);
        Text Anleitung19 = new Text(50,1030,30,Line[18]);
        wurzel.add(Anleitung19);
        Text Anleitung20 = new Text(50,1080,30,Line[19]);
        wurzel.add(Anleitung20);
        Text Anleitung21 = new Text(50,1130,30,Line[20]);
        wurzel.add(Anleitung21);
        Text Anleitung22 = new Text(50,1180,30,Line[21]);
        wurzel.add(Anleitung22);
        Text Anleitung23 = new Text(50,1230,30,Line[22]);
        wurzel.add(Anleitung23);
        Text Anleitung24 = new Text(50,1280,30,Line[23]);
        wurzel.add(Anleitung24);


    }

    public void tasteReagieren(int tastencode)
    {
        
    }
}

