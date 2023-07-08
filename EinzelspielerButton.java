
import ea.*;

public class EinzelspielerButton extends Button
{
 public EinzelspielerButton(float x, float y, int groesse, String newDateipfad)
 {
     super(x, y, groesse, newDateipfad);
 }
    
 public int getCode()
 {
     return 7;
 }
 
 public void gedrückt()
 {
     ButtonSound.playBS();
     myGame.getInstance().gamemodeSetzen(GamemodeType.EINZELSPIELER);
     myGame.getInstance().bildschirmWechseln(BildschirmType.AUSWAHLBILDSCHIRM_LEHRER);
 }
}
