/**
 * DIESE KLASSE NICHT VERÄNDERN
 * 
 * @Author: Max E.
 */

import ea.*;

public class ButtonVerwaltung implements MausReagierbar
{
    
    private Game game;
    
    private Maus maus;
    
    Button [] buttons;
    
    private static ButtonVerwaltung instance;
        
        private ButtonVerwaltung(myGame game)
        {
        this.game = game;
        this.maus = game.getMaus();
        buttons = new Button[8];
        }
        
        public static void createInstance (myGame game)
        {
            if (instance == null)
                instance = new ButtonVerwaltung(game);
        }
        
        public static ButtonVerwaltung getInstance()
        {
            if (instance == null)
            throw new UnsupportedOperationException();
            
            return instance;
        }
        
        public void buttonAnmelden(Button button)
        {
            maus.anmelden(this, button, button.getCode());
            buttons[button.getCode()] = button;
        }
        
        
        /**
         * Reagiert auf das Klicken auf verschiedene Objekte, welche durch ihren eindeutigen Code bestimmt sind
         */
         public void mausReagieren (int code)
        {
        if (buttons[code] != null && buttons[code].isActive)
            buttons[code].gedrückt();
        }
}
