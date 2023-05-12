import ea.*;
public class exampleVelocity extends Game implements Ticker, TastenLosgelassenReagierbar
{

private Rechteck car;

private DIRECTION direction;

private float speed;

private float angle;

private float acc;

private float dec;

private float rotspeed;


public exampleVelocity()
{
super(3000,2000);

speed = 0f;

angle = 0f;

acc = 0.001f;

dec = 0.001f;

rotspeed = 0.05f;

car = new Rechteck(100,100,100,70);

Rechteck wand = new Rechteck(1000,0, 100, 2000);

wand.passivMachen();

wurzel.add(wand);

wurzel.add(car);

car.aktivMachen();

car.schwerkraftAktivSetzen(false);

direction = DIRECTION.NEUTRAL;


manager.anmelden(this, 1);

tastenLosgelassenReagierbarAnmelden(this);


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

case ACC:
speed += acc;
break;

case NEUTRAL:
default:

if (speed > 0)
{
speed -= dec;
} else
{
    speed = 0;
}



}   
    
    car.bewegen(speed*(float)Math.cos(Math.toRadians(angle)), speed*(float)Math.sin(Math.toRadians(angle)));
    
    car.drehenAbsolut(angle);
    

}


@Override
public void tasteReagieren(int code)

{
    
switch (code)
{

case 0:
direction = DIRECTION.LEFT;
break;

case 3:
direction = DIRECTION.RIGHT;
break;

case 30:
direction = DIRECTION.ACC;

default:

}

}

@Override
public void tasteLosgelassen(int code)
{
    
    direction = DIRECTION.NEUTRAL;
    

}

}