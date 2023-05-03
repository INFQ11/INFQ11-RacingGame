/**
 * DIESE KLASSE NICHT VERÄNDERN
 */

import ea.*;

public abstract class Button extends Bild
{
    protected boolean isActive;
    
   public Button(float x, float y, int groesse , String newDateipfadBild )
   {
       super(x, y, groesse, newDateipfadBild);
   }
   
   public abstract void gedrückt();
   
   public abstract int getCode();
   
   /**
         * CODE 0: STARTBUTTON
         * CODE 1: EINSTELLUNGEN
         * CODE 2: OK
         * CODE 3: PFEILVOR
         * CODE 4: PFEILZURÜCK
         * CODE 5: ZURÜCK
         * CODE 6: MEHRSPIELER
         * CODE 7: EINZELSPIELER
         */
}
