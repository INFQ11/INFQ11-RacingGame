

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
        return switch (buttonType)
        {
            case START -> buttons[0];
            case EINSTELLUNGEN -> buttons[1];
            case OK -> buttons[2];
            case PFEILVOR -> buttons[3];
            case PFEILZURÜCK -> buttons[4];
            case ZURÜCK -> buttons[5];
            case MEHRSPIELER -> buttons[6];
            case EINSPIELER -> buttons[7];
        };
    }
    
    public static void resetButtons()
    {
        for (Button b : ButtonVerwaltung.getInstance().getButtons())
        {
            if (b!= null) b.setActive(true);
        }
    }
    
    public static void bildschirmWechseln(BildschirmType bildschirmType)
    {
        myGame.getInstance().bildschirmWechseln(bildschirmType);
    }
}
