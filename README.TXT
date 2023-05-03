------------------------------------------------------------------------

PROJEKTBEZEICHNUNG: 2D-Rennspiel mit Lehrern
PROJEKTZWECK: Gute Note in Informatik
VERSION: 1.0
WIE IST DAS PROJEKT ZU STARTEN: myGame --> main-Methode (falls vorhanden) oder "getInstance()"
AUTOR(EN): Q11-Informatik (Abiturjahrgang 2024)


-TODO:
    
1.) Erstellung der BildschirmTypes (Enum) + Erstellung der Bildschirmklassen (Unterklassen!)
    
    Benötigte Bildschirme:
    - Startbildschirm
    - Auswahlbildschirm_Lehrer
    - Auswahlbildschirm_Spieler
    - Spielbildschirm
    
2.) Implementierung der Methode "getBildschirm(BildschirmType)" in "Bildschirm"
    --> Soll für den übergebenen Enum-Type den richtigen Bildschirm zurückliefern
    
3.) Singleton-Entwurfsmuster in Klasse myGame erstellen

4.) Erstellung der benötigten Attribute in Klasse myGame (Maus, Bildschirm, BildschirmType)

5.) Anmeldung einer Maus

6.) Auskommentieren der Getter in myGame

7.) Methode "bildschirmWechseln" in Klasse myGame erstellen

8.) Erstellung der Button-Klassen (Unterklassen von Button!)
    + Überschreiben von getCode() und gedrückt()
    
    Benötigte Buttons:
    - StartButton
    - EinstellungenButton
    - OKButton
    - PfeilVorButton
    - PfeilZurückButton
    - ZurückButton
    - MehrspielerButton
    - EinzelspielerButton

9.) Button-Sammlung --> Erzeugung der benötigten Buttons + Anmeldung bei ButtonVerwaltung + 
    
    
10.) Button-Klassen --> "gedrückt()"-Methoden definieren + "getCode()"-Methoden definieren

11.) Bildschirm-Klassen --> Hintergrundbilder hinzufügen, Benötigte Buttons jeweils auf active setzen + ALLES zur Wurzel adden

12.) Button-Sammlung --> Genaue Definition der Koordinaten, Größen, Dateipfaden der Bilder, etc.
