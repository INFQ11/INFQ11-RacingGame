// Konstantin Silberbauer Q11

import ea.*;

public class Einzelspieler extends Bildschirm
{
    
    public Einzelspieler()
    {
        Bild b = new Bild(0, 0, 100, TexturManager.DATEIPFAD + "Strecke (Upscaled).png");
        wurzel.add(b);
        
        LEHRER lehrer = myGame.getInstance().getLehrer();
        Fahrer fahrer = new Fahrer(960,540,100, "Player 1", lehrer, false);
        wurzel.add(FahrerFacade.getRaum());

        
        Rechteck WandVert1 = new Rechteck(610,560,10,2640);
        WandVert1.passivMachen();
        wurzel.add(WandVert1);

        Rechteck WandHor1 = new Rechteck(660,500,405,10);
        WandHor1.passivMachen();
        wurzel.add(WandHor1);

        Rechteck WandHor2 = new Rechteck(610,720,630,10);
        WandHor2.passivMachen();
        wurzel.add(WandHor2);

        Rechteck WandHor3 = new Rechteck(1360,1060,410,10);
        WandHor3.passivMachen();
        wurzel.add(WandHor3);

        Rechteck WandHor4 = new Rechteck(610,1440,700,10);
        WandHor4.passivMachen();
        wurzel.add(WandHor4);

        Rechteck WandHor5 = new Rechteck(950,2000,1750,10);
        WandHor5.passivMachen();
        wurzel.add(WandHor5);

        Rechteck WandVert2 = new Rechteck(1770,0,10,2000);
        WandVert2.passivMachen();
        wurzel.add(WandVert2);

        Rechteck WandHor6 = new Rechteck(2700,1685,270,10);
        WandHor6.passivMachen();
        wurzel.add(WandHor6);

        Rechteck WandHor7 = new Rechteck(2285,785,270,10);
        WandHor7.passivMachen();
        wurzel.add(WandHor7);

        Rechteck WandHor8 = new Rechteck(2560,500,2665,10);
        WandHor8.passivMachen();
        wurzel.add(WandHor8);

        Rechteck WandVert3 = new Rechteck(3450,500,10,1780);
        WandVert3.passivMachen();
        wurzel.add(WandVert3);

        Rechteck WandHor9 = new Rechteck(3975,1337,2000,10);
        WandHor9.passivMachen();
        wurzel.add(WandHor9);

        Rechteck WandVert4 = new Rechteck(5225,500,10,440);
        WandVert4.passivMachen();
        wurzel.add(WandVert4);

        Rechteck WandVert5 = new Rechteck(4490,820,10,1150);
        WandVert5.passivMachen();
        wurzel.add(WandVert5);

        Rechteck WandHor10 = new Rechteck(4490,1730,400,10);
        WandHor10.passivMachen();
        wurzel.add(WandHor10);

        Rechteck WandHor11 = new Rechteck(620,2280,4500,10);
        WandHor11.passivMachen();
        wurzel.add(WandHor11);

        Rechteck WandVert6 = new Rechteck(5150,1790,10,1350);
        WandVert6.passivMachen();
        wurzel.add(WandVert6);

        Rechteck WandHor12 = new Rechteck(3890,3220,1140,10);
        WandHor12.passivMachen();
        wurzel.add(WandHor12);

        Rechteck WandHor13 = new Rechteck(3750,2950,200,10);
        WandHor13.passivMachen();
        wurzel.add(WandHor13);

        Rechteck WandHor14 = new Rechteck(3260,2620,550,10);
        WandHor14.passivMachen();
        wurzel.add(WandHor14);

        Rechteck WandVert7 = new Rechteck(3525,2410,10,2000);
        WandVert7.passivMachen();
        wurzel.add(WandVert7);

        Rechteck WandHor15 = new Rechteck(3040,2950,290,10);
        WandHor15.passivMachen();
        wurzel.add(WandHor15);

        Rechteck WandHor16 = new Rechteck(610,3220,2590,10);
        WandHor16.passivMachen();
        wurzel.add(WandHor16);

    }
    
    @Override
    public void tasteReagieren(int tastencode)
    {

    }
}
