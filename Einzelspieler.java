// Konstantin S.

import ea.*;

public class Einzelspieler extends Bildschirm
{
    
    public Einzelspieler()
    {
        // Ergänzung wenn wir die Gamedynamik programmieren
        
        Fahrer fahrer = new Fahrer(0,0,100, "Player 1", LEHRER.BAUMGARTNER, false);
        wurzel.add(fahrer.getRaum());
    }
    
    @Override
    public void tasteReagieren(int tastencode)
    {
        if (myGame.getAutoSpieler1() != null)
            myGame.getAutoSpieler1().tasteReagieren(tastencode);
    }
}
