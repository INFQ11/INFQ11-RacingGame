import ea.*;

public class ButtonSammlung
{
    public static void initButtons()
    {
        // Soll die benötigten Buttons erzeugen und bei der ButtonVerwaltung anmelden
        StartButton st = new StartButton(0,0,30,"D:\\Git Workspace\\Q11_Informatik_Template_Startmenü\\pictures\\Button.png");
        ButtonVerwaltung.getInstance().buttonAnmelden(st);
    }
}
