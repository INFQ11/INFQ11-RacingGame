

// Max E.

import ea.*;

public abstract class Button extends Bild
{
    protected boolean isActive;
    
   public Button(float x, float y, int groesse , String newDateipfadBild )
   {
       super(x, y, groesse, newDateipfadBild);
       ButtonVerwaltung.getInstance().buttonAnmelden(this);
   }
   
   public void setActive (boolean bool)
   {
       this.isActive = bool;
   }
   public abstract void gedrückt();
   
   public abstract int getCode();
   
}
