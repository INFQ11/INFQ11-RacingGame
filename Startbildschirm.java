import ea.*;

public class Startbildschirm extends Bildschirm
{
    public Startbildschirm()
    {
        buttons[0].isActive = true;
        wurzel.add(buttons[0]);
        
        int breite = myGame.BREITE;
        int höhe = myGame.HOEHE;
        
        Bild bild = new Bild(0,0,breite, höhe,"D:\\Git Workspace\\Q11_Informatik_Template_Startmenü\\pictures\\Background.jpg");
        wurzel.add(bild);
    }
}
