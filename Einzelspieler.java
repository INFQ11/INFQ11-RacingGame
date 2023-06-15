// Konstantin Silberbauer Q11

import ea.*;

public class Einzelspieler extends Bildschirm
{
    
    public Einzelspieler()
    {
        Fahrer fahrer = new Fahrer(0,0,50, "Player 1", LEHRER.GUST, false);
        wurzel.add(FahrerFacade.getRaum());
    }
    
    @Override
    public void tasteReagieren(int tastencode)
    {

    }
}
