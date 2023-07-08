
import ea.*;

public class MehrspielerButton extends Button
{
 public MehrspielerButton(float x, float y, int groesse, String newDateipfad)
 {
        super(x, y, groesse, newDateipfad);
 }
    
 public int getCode()
 {
     return 6;
 }
 
 public void gedrückt()
 {
     ButtonSound.playBS();
     myGame.getInstance().gamemodeSetzen(GamemodeType.MEHRSPIELER);
     myGame.getInstance().bildschirmWechseln(BildschirmType.AUSWAHLBILDSCHIRM_LEHRER);
     
     if (myGame.getInstance().frage("Online Multiplayer game? ! Server not provided by default"))
     myGame.getInstance().multiplayerInstantiation();
 }
}
