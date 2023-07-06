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

        Rechteck WandHor9 = new Rechteck(3975,1337,1790,10);
        WandHor9.passivMachen();
        wurzel.add(WandHor9);

        Rechteck WandVert4 = new Rechteck(5225,500,10,440);
        WandVert4.passivMachen();
        wurzel.add(WandVert4);

        Rechteck WandVert5 = new Rechteck(4490,820,10,1150);
        WandVert5.passivMachen();
        wurzel.add(WandVert5);

        Rechteck WandHor10 = new Rechteck(4490,1730,200,10);
        WandHor10.passivMachen();
        wurzel.add(WandHor10);

        Rechteck WandHor11 = new Rechteck(620,2280,4540,10);
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

        Rechteck WandVert7 = new Rechteck(3525,2430,10,1180);
        WandVert7.passivMachen();
        wurzel.add(WandVert7);

        Rechteck WandHor15 = new Rechteck(3040,2950,290,10);
        WandHor15.passivMachen();
        wurzel.add(WandHor15);

        Rechteck WandHor16 = new Rechteck(610,3220,2590,10);
        WandHor16.passivMachen();
        wurzel.add(WandHor16);
        
        Rechteck WandVert7b = new Rechteck(3534,2450,31,1160);
        WandVert7b.passivMachen();
        
        Rechteck WandHor11b = new Rechteck(620,2289,2320,31);
        WandHor11b.passivMachen();
        
        Rechteck WandHor11c = new Rechteck(3040,2200,950,81);
        WandHor11c.passivMachen();

        
        Rechteck WandVert6b = new Rechteck(5130,1820,31,1320);
        WandVert6b.passivMachen();
        
        Rechteck WandHor11d = new Rechteck(3975,2289,1150,31);
        WandHor11d.passivMachen();
        
        Rechteck WandHor8b = new Rechteck(2560,509,2665,31);
        WandHor8b.passivMachen();
        
        Rechteck WandVert4b = new Rechteck(5195,500,50,440);
        WandVert4b.passivMachen();
        
        Rechteck WandVert3b = new Rechteck(3459,500,31,1780);
        WandVert3b.passivMachen();
        
        Rechteck WandHor9b = new Rechteck(3975,1310,1790,40);
        WandHor9b.passivMachen();
        
        
        Rechteck WandVert5b = new Rechteck(4499,820,31,1150);
        WandVert5b.passivMachen();

        Rechteck WallU = new Rechteck(0,0,1920*3,10);
        WallU.passivMachen();
        wurzel.add(WallU);

        Rechteck WallUb = new Rechteck(0,-100,6000,100);
        WallUb.passivMachen();


        Rechteck WallR = new Rechteck(1920*3,0,10,3600);
        WallR.passivMachen();
        wurzel.add(WallR);

        Rechteck WallRb = new Rechteck(1920*3,0,110,3600);
        WallRb.passivMachen();


        Rechteck WallD = new Rechteck(0,3600,1920*3,10);
        WallD.passivMachen();
        wurzel.add(WallD);

        Rechteck WallDb = new Rechteck(0,3600,6000,110);
        WallDb.passivMachen();


        Rechteck WallL = new Rechteck(0,0,10,3600);
        WallL.passivMachen();
        wurzel.add(WallL);

        Rechteck WallLb = new Rechteck(-100,-1000,100,5000);
        WallLb.passivMachen();

        
        Countdown c = new Countdown(1400 ,540);
        wurzel.add(c.getRaum());
        new Thread(c).start();
    }


    @Override
    public void tasteReagieren(int tastencode)
    {

    }
}
