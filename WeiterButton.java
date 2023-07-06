import ea.*;

/**
 * @Author: Konstantin S.
 */
public class WeiterButton extends Button
{
    public WeiterButton(float x, float y, int groesse, String newDateipfad)
    {
        super(x, y, groesse, newDateipfad);
    }

    @Override
    public void gedrückt()
    {
        myGame.getInstance().bildschirmWechseln(BildschirmType.STARTBILDSCHIRM);
    }

    @Override
    public int getCode()
    {
        return 9;
    }
}
