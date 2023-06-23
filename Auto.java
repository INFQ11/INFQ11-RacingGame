// Constantin H.

import ea.*;

public class Auto extends Bild
{
    private DIRECTION direction;
    
    private float speed;
    private float maxspeed;
    private float acceleration;
    private float deceleration;
    private float angle;
    private float rotspeed;
    private boolean accbool;
    
    private boolean secondPlayer;
    
    private String ee;
    
    // Werden nicht benutzt, nur zur Erinnerung 
    // Können auch nicht zB im Switch eingesetzt werden, da keine "constant expressions"
    
    private static int [] STEUERUNG1 = {0, 3, 30};
    private static int [] STEUERUNG2 = {29, 27, 26};
    
    public Auto(int x, int y, int groesse, LEHRER lehrer, boolean secondPlayer)
    {
        super(x,y,groesse, lehrer.DATEIPFAD_AUTO);
        
        this.speed = 0f;
        this.maxspeed = lehrer.MAXSPEED;
        this.acceleration = lehrer.ACCELERATION;
        this.deceleration = lehrer.DECELERATION;
        this.angle = 0f;
        this.rotspeed = 0.15f;
        this.accbool = false;
        
        this.aktivMachen();
        this.schwerkraftAktivSetzen(false);
    
        
        this.direction = DIRECTION.NEUTRAL;
        this.secondPlayer = secondPlayer;

        if (!secondPlayer)
        myGame.getInstance().getCam().positionSetzen(this.getX() - 400, this.getY() - 300);
    }
    
    
    
    public void tick()
    {
    switch (direction)
    {

    case LEFT:
    angle -= rotspeed;
    break;

    case RIGHT:
    angle += rotspeed;
    break;

    case NEUTRAL:
    default:

    }

    if (accbool)
    {

    if ((speed + acceleration) < maxspeed)
    {
    speed += acceleration;
    } else
    {
    speed = maxspeed;
    }

    } else
    {
    
    if ((speed - deceleration) > 0)
    {
    speed -= deceleration;
    } else
    {
    speed = 0;
    }



    }

    if (angle < 0)
        angle = 360 - angle;
    else if (angle > 360)
    angle %= 360; //Angle Range Control
    
    
    this.verschieben(speed*(float)Math.cos(Math.toRadians(this.gibDrehung())), speed*(float)Math.sin(Math.toRadians(this.gibDrehung())));

    if (!secondPlayer)
    myGame.getInstance().getCam().positionSetzen(this.getX() - 400, this.getY() - 300);


    this.drehenAbsolut(angle);
    }


    public void tasteReagieren(int code)

    {
        
    // Tastenlayout mit WASD + Leertaste
    
    if (!secondPlayer)
    switch (code)
    {

    case 0:
    direction = DIRECTION.LEFT;
    break;

    case 3:
    direction = DIRECTION.RIGHT;
    break;

    case 30:
    case 22:
    accbool = true;

    default:

    }
    else 
    
    // Tastenlayout mit Pfeiltasten
    
    switch (code)
    {

    case 29:
    direction = DIRECTION.LEFT;
    break;

    case 27:
    direction = DIRECTION.RIGHT;
    break;

    case 26:
    accbool = true;

    default:

    }

    //EE
    if (code < 10)
    {
    ee = ee + "b" + Integer.toString(code);
    } else
    {
    ee = ee + Integer.toString(code);
    }

    ee = ee.substring(2, ee.length());

    if (ee.contains("b217b484"))
    {
    accbool = false;
    direction = DIRECTION.NEUTRAL;
    myGame.getInstance().sicherheitsFrage("Congratulations, you found the EasterEgg of this Game and with it, the names of its creators: Hurensohn, Maximilian Emberger and Konstantin Silberbauer");
    ee = "aaaaaaaaaaaaaaaaaaaaaa";
    }

    }


    public void tasteLosgelassen(int code)
    {
    
    if (!secondPlayer)
    switch (code)
    {

    case 0:
    if (direction == DIRECTION.LEFT)
    {
    direction = DIRECTION.NEUTRAL;
    }
    break;

    case 3:
    if (direction == DIRECTION.RIGHT)
    {
    direction = DIRECTION.NEUTRAL;
    }
    break;

    case 30:
    case 22:
    accbool = false;

    default:

    }
    else 
    switch (code)
    {

    case 29:
    if (direction == DIRECTION.LEFT)
    {
    direction = DIRECTION.NEUTRAL;
    }
    break;

    case 27:
    if (direction == DIRECTION.RIGHT)
    {
    direction = DIRECTION.NEUTRAL;
    }
    break;

    case 26:
    accbool = false;

    default:

    }

    }
    
    public void setRotation(float rot)
    {
        this.angle = rot;
    }
    
    public float getRotation()
    {
        return angle;
    }
}
