import ea.*;

public class OKButton extends Button
{
  public OKButton(float x, float y, int groesse, String newDateipfad)
 {
     super(x, y, groesse, newDateipfad);
 }
    
 public int getCode()
 {
     return 2;
 }
 
 public void gedrückt()
 {
     if (myGame.getInstance().getCurrentGamemodeType() == GamemodeType.EINZELSPIELER)
         
         myGame.getInstance().bildschirmWechseln(BildschirmType.EINZELSPIELER);
         
     else myGame.getInstance().bildschirmWechseln(BildschirmType.MEHRSPIELER);
 }
}
