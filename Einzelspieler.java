// Konstantin Silberbauer Q11

import ea.*;

import java.util.HashSet;

public class Einzelspieler extends Bildschirm
{
    public HashSet<Rechteck> obstacles = new HashSet<>();

    public Einzelspieler()
    {
        Bild b = new Bild(0, 0, 100, TexturManager.DATEIPFAD + "Strecke.png");
        wurzel.add(b);
        
        LEHRER lehrer = myGame.getInstance().getLehrer();
        Fahrer fahrer = new Fahrer(477,2041,100, "Spieler 1", lehrer, false);
        wurzel.add(FahrerFacade.getRaum());

        Rechteck WandVert1 = new Rechteck(610,560,10,2640);
        obstacles.add(WandVert1);
        WandVert1.passivMachen();
        

        Rechteck WandHor1 = new Rechteck(660,500,405,10);
        obstacles.add(WandHor1);
        WandHor1.passivMachen();
        

        Rechteck WandHor2 = new Rechteck(610,720,630,10);
        obstacles.add(WandHor2);
        WandHor2.passivMachen();
        

        Rechteck WandHor3 = new Rechteck(1360,1060,410,10);
        obstacles.add(WandHor3);
        WandHor3.passivMachen();
        

        Rechteck WandHor4 = new Rechteck(610,1440,700,10);
        obstacles.add(WandHor4);
        WandHor4.passivMachen();
        

        Rechteck WandHor5 = new Rechteck(950,2000,1750,10);
        obstacles.add(WandHor5);
        WandHor5.passivMachen();
        

        Rechteck WandVert2 = new Rechteck(1770,0,10,2000);
        obstacles.add(WandVert2);
        WandVert2.passivMachen();
        wurzel.add(WandVert2);

        Rechteck WandHor6 = new Rechteck(2700,1685,270,10);
        obstacles.add(WandHor6);
        WandHor6.passivMachen();
        

        Rechteck WandHor7 = new Rechteck(2285,785,270,10);
        obstacles.add(WandHor7);
        WandHor7.passivMachen();
        

        Rechteck WandHor8 = new Rechteck(2560,500,2665,10);
        obstacles.add(WandHor8);
        WandHor8.passivMachen();
        

        Rechteck WandVert3 = new Rechteck(3450,500,10,1780);
        obstacles.add(WandVert3);
        WandVert3.passivMachen();
        

        Rechteck WandHor9 = new Rechteck(3975,1337,1790,10);
        obstacles.add(WandHor9);
        WandHor9.passivMachen();
        

        Rechteck WandVert4 = new Rechteck(5225,500,10,440);
        obstacles.add(WandVert4);
        WandVert4.passivMachen();
        

        Rechteck WandVert5 = new Rechteck(4490,820,10,1150);
        obstacles.add(WandVert5);
        WandVert5.passivMachen();
        

        Rechteck WandHor10 = new Rechteck(4490,1730,200,10);
        obstacles.add(WandHor10);
        WandHor10.passivMachen();
        

        Rechteck WandHor11 = new Rechteck(620,2280,4540,10);
        obstacles.add(WandHor11);
        WandHor11.passivMachen();
        

        Rechteck WandVert6 = new Rechteck(5150,1790,10,1350);
        obstacles.add(WandVert6);
        WandVert6.passivMachen();
        

        Rechteck WandHor12 = new Rechteck(3890,3220,1140,10);
        obstacles.add(WandHor12);
        WandHor12.passivMachen();
        

        Rechteck WandHor13 = new Rechteck(3750,2950,200,10);
        obstacles.add(WandHor13);
        WandHor13.passivMachen();
        

        Rechteck WandHor14 = new Rechteck(3260,2620,550,10);
        obstacles.add(WandHor14);
        WandHor14.passivMachen();
        

        Rechteck WandVert7 = new Rechteck(3525,2430,10,1180);
        obstacles.add(WandVert7);
        WandVert7.passivMachen();
        

        Rechteck WandHor15 = new Rechteck(3040,2950,290,10);
        obstacles.add(WandHor15);
        WandHor15.passivMachen();
        

        Rechteck WandHor16 = new Rechteck(610,3220,2590,10);
        obstacles.add(WandHor16);
        WandHor16.passivMachen();
        
        
        Rechteck WandVert7b = new Rechteck(3534,2450,31,1160);
        obstacles.add(WandVert7b);
        WandVert7b.passivMachen();
        
        Rechteck WandHor11b = new Rechteck(620,2289,2320,31);
        obstacles.add(WandHor11b);
        WandHor11b.passivMachen();
        
        Rechteck WandHor11c = new Rechteck(3040,2200,950,81);
        obstacles.add(WandHor11c);
        WandHor11c.passivMachen();

        
        Rechteck WandVert6b = new Rechteck(5130,1820,31,1320);
        obstacles.add(WandVert6b);
        WandVert6b.passivMachen();
        
        Rechteck WandHor11d = new Rechteck(3975,2289,1150,31);
        obstacles.add(WandHor11d);
        WandHor11d.passivMachen();
        
        Rechteck WandHor8b = new Rechteck(2560,509,2665,31);
        obstacles.add(WandHor8b);
        WandHor8b.passivMachen();
        
        Rechteck WandVert4b = new Rechteck(5195,500,50,440);
        obstacles.add(WandVert4b);
        WandVert4b.passivMachen();
        
        Rechteck WandVert3b = new Rechteck(3459,500,31,1780);
        obstacles.add(WandVert3b);
        WandVert3b.passivMachen();
        
        Rechteck WandHor9b = new Rechteck(3975,1310,1790,40);
        obstacles.add(WandHor9b);
        WandHor9b.passivMachen();
        
        
        Rechteck WandVert5b = new Rechteck(4499,820,31,1150);
        obstacles.add(WandVert5b);
        WandVert5b.passivMachen();

        Rechteck WallU = new Rechteck(0,0,1920*3,10);
        obstacles.add(WallU);
        WallU.passivMachen();
        wurzel.add(WallU);

        Rechteck WallUb = new Rechteck(0,-1000,6000,1000);
        obstacles.add(WallUb);
        WallUb.passivMachen();


        Rechteck WallR = new Rechteck(1920*3,0,10,3600);
        obstacles.add(WallR);
        WallR.passivMachen();
        wurzel.add(WallR);

        Rechteck WallRb = new Rechteck(1920*3,0,1010,3600);
        obstacles.add(WallRb);
        WallRb.passivMachen();


        Rechteck WallD = new Rechteck(0,3600,1920*3,10);
        obstacles.add(WallD);
        WallD.passivMachen();
        wurzel.add(WallD);

        Rechteck WallDb = new Rechteck(0,3600,6000,1010);
        obstacles.add(WallDb);
        WallDb.passivMachen();


        Rechteck WallL = new Rechteck(0,0,10,3600);
        obstacles.add(WallL);
        WallL.passivMachen();
        wurzel.add(WallL);

        Rechteck WallLb = new Rechteck(-1000,-1000,1000,5000);
        obstacles.add(WallLb);
        WallLb.passivMachen();

        Checkpoint cp1 = new Checkpoint(739, 250, 300,300, 1);
        new Thread(cp1).start();
        //wurzel.add(cp1);
        Checkpoint cp2 = new Checkpoint(1556, 2000, 300,300, 1);
        new Thread(cp2).start();
        //wurzel.add(cp2);
        Checkpoint cp3 = new Checkpoint(4110, 3150, 300,300, 1);
        new Thread(cp3).start();
        //wurzel.add(cp3);
        Checkpoint cp4 = new Checkpoint(1283, 3180, 300,300, 1);
        new Thread(cp4).start();
        //wurzel.add(cp4);
        Checkpoint END = new Checkpoint(346, 1720, 300,300, 69);
        new Thread(END).start();
        //wurzel.add(END);


        Countdown c = new Countdown(1400 ,540);
        wurzel.add(c.getRaum());
        new Thread(c).start();
    }


    @Override
    public void tasteReagieren(int tastencode)
    {
        if (QuestionController.getCurrentQuestion() != null && tastencode >= 34 && tastencode <= 36) {
            QuestionController.answer(tastencode - 33);
        }
    }
}
