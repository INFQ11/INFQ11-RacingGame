import ea.*;
/**
 * @author: Konstantin S.
 */
public class menu
{
    private static Sound menu = new Sound("Resources/Sounds/menu.mp3");
    public static void playMenu()
    {
        menu.play();
    }

    public static void stopMenu()
    {
        menu.stop();
    }
}
