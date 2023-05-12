// Max E.

import ea.*;

/**
 * Klasse, die rein dafür zuständig ist, wichtige/allgemeine Texturdaten zu sammeln
 * z.B. Den allgemeinen Dateipfad zu den Bildern --> z.B. P:\\Austausch\\Pictures
 * 
 * Wenn dann ein Bild erzeugt wird:
 * 
 * new Bild (x,y,groesse, TexturManager.DATEIPFAD + "Button.png")
 * --> Leichter möglich, das Verzeichnis zu ändern, ohne 500 Bilder-Pfade austauschen zu müssen
 */
public class TexturManager
{
      private TexturManager()
      {
          throw new UnsupportedOperationException("Do not instantiate this class");
      }
      
      public static final int BREITE = 1280;
      public static final int HOEHE = 720;
      public static final String DATEIPFAD = "";
}
