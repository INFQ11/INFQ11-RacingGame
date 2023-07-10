import ea.*;

import java.awt.*;

public class Question extends Rechteck {

    Knoten wurzel = new Knoten();

    private int correctAnswer;

    public Question(String q, String a1, String a2, String a3, int correctAnswer) {
        super(0,0,0,0);
        this.correctAnswer = correctAnswer;
        int x = 1250;
        int y = 0;

        Rechteck background = new Rechteck( x, y, 700, 210);
        wurzel.add(background);

        Text question = new Text(x + 20, y + 10, "Q: " + q);
        question.setzeFarbe(Color.BLACK);
        Text answer1 = new Text(x + 20, y + 50, "1.) " + a1);
        answer1.setzeFarbe(Color.BLACK);
        Text answer2 = new Text(x + 20, y + 90, "2.) " +a2);
        answer2.setzeFarbe(Color.BLACK);
        Text answer3 = new Text(x + 20, y + 130, "3.) " +a3);
        answer3.setzeFarbe(Color.BLACK);
        Text info = new Text (x + 20, y + 170, "Tippen Sie die korresponierende Zahl ein!");
        info.setzeFarbe(Color.BLACK);

        wurzel.add(question);
        wurzel.add(answer1);
        wurzel.add(answer2);
        wurzel.add(answer3);
        wurzel.add(info);
    }

    public Raum getRaum() {
        return wurzel;
    }
}
