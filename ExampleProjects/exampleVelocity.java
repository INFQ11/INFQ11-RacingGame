package ExampleProjects;

import ea.*;
public class exampleVelocity extends Game 
{

private Rechteck r;

public exampleVelocity()
{

r = new Rechteck(0,0,50,50);

wurzel.add(r);

r.newtonschMachen();

r.masseSetzen(100);

}

@Override
public void tasteReagieren (int code)
{

switch (code)
{
case 22: r.geschwindigkeitSetzen(new Vektor (0,-1));
break;

case 0:
r.geschwindigkeitSetzen(new Vektor(-1,0));
break;

case 18:
r.geschwindigkeitSetzen(new Vektor(0,1));
break;

case 3:
r.geschwindigkeitSetzen(new Vektor(1,0));

default:

}
}

}