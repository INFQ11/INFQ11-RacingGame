
public class ButtonFacade
{
    private static myGame game;
    private static Button [] buttons;
    private static ButtonFacade instance;
    
    public static void instantiateFacade(myGame game)
    {
        ButtonVerwaltung.createInstance(game);
        ButtonSammlung.instantiateButtons();
        buttons = ButtonVerwaltung.getInstance().getButtons();
    }
    
    public static Button getButton(ButtonType buttonType)
    {
       switch (buttonType)
        {
            case START: return buttons[0];
            case EINSTELLUNGEN: return buttons[1];
            case OK: return buttons[2];
            case PFEILVOR: return buttons[3];
            case PFEILZURÜCK: return buttons[4];
            case ZURÜCK: return buttons[5];
            case MEHRSPIELER: return buttons[6];
            case EINSPIELER: return buttons[7];
            case SMASH: return buttons[8];
            case PASS: return buttons[9];
            default: return null;
        }
    }
    
    public static void resetButtons()
    {
        for (Button b : ButtonVerwaltung.getInstance().getButtons())
        {
            if (b!= null) b.setActive(false);
        }
    }
    
    public static void bildschirmWechseln(BildschirmType bildschirmType)
    {
        myGame.getInstance().bildschirmWechseln(bildschirmType);
    }
}
