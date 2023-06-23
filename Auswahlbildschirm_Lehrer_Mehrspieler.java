/**
 * @Author Konstantin S.
 */
import ea.*;
public class Auswahlbildschirm_Lehrer_Mehrspieler extends Bildschirm
{

    public static Lehrerauswahl lehrerauswahl;
    public static Lehrerauswahl lehrerauswahl2;

    public Auswahlbildschirm_Lehrer_Mehrspieler()
    {
        Bild background = new Bild(0,0,67,"Resources/Design.Startbildschrim/Lehrerauswahl Mehrspieler/Mehrspielerauswahl.png");
        wurzel.add(background);

        ButtonFacade.getButton(ButtonType.OK).setActive(true);
        wurzel.add(ButtonFacade.getButton(ButtonType.OK));

        ButtonFacade.getButton(ButtonType.SMASH).setActive(true);
        wurzel.add(ButtonFacade.getButton(ButtonType.SMASH));

        ButtonFacade.getButton(ButtonType.PFEILVOR).setActive(true);
        wurzel.add(ButtonFacade.getButton(ButtonType.PFEILVOR));

        ButtonFacade.getButton(ButtonType.PASS).setActive(true);
        wurzel.add(ButtonFacade.getButton(ButtonType.PASS));

        lehrerauswahl = new Lehrerauswahl(500,400,650,400);
        wurzel.add(lehrerauswahl.getRaum());

        lehrerauswahl2 = new Lehrerauswahl(1000,400,1150,400);
        wurzel.add(lehrerauswahl2.getRaum());
    }

    @Override
    public void tasteReagieren(int tastencode)
    {

    }
}
