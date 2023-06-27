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
      
      public static final float BREITE = 1920;
      public static final float HOEHE = 1080;
      public static final String DATEIPFAD = "Resources/Pictures/";

      public static final String FONT = "Resources/Font/8-bit_pusab.ttf";
}
