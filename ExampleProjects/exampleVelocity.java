package ExampleProjects;

import ea.*;
public class exampleVelocity extends Game implements Ticker
{

private Rechteck car;

private DIRECTION direction;

private float speed;

public exampleVelocity()
{
super(3000,2000);

speed = 1f;

car = new Rechteck(100,100,100,100);

Rechteck wand = new Rechteck(1000,0, 100, 2000);

wand.passivMachen();

wurzel.add(wand);

wurzel.add(car);

car.aktivMachen();

car.schwerkraftAktivSetzen(false);


direction = DIRECTION.BRAKE;

manager.anmelden(this, 1);



}

public void tick()
{
    switch (direction)
    {
        case FORWARD -> car.bewegen(0,-speed);
        case BACKWARDS -> car.bewegen(0, speed);
        case LEFT -> car.bewegen(-speed, 0);
        case RIGHT -> car.bewegen(speed, 0);
        default -> car.bewegen(0,0);
    }
    
    if (speed < 3f) {
    speed += 0.0001f;
    }
}


@Override
public void tasteReagieren (int code)
{

switch (code)
{
case 22: direction = DIRECTION.FORWARD;
break;

case 0:
direction = DIRECTION.LEFT;
break;

case 18:
direction = DIRECTION.BACKWARDS;
break;

case 3:
direction = DIRECTION.RIGHT;
break;

case 30:
direction = DIRECTION.BRAKE;


default:

}
}

}