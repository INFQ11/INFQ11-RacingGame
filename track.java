import ea.*;
/**
 * @author: Konstantin S.
 */
public class track
{
    private static Sound track = new Sound("Resources/Sounds/track.mp3");
    public static void playTrack()
    {
        track.play();
    }

    public static void stopTrack()
    {
        track.stop();
    }
}
