import java.util.HashSet;

public class QuestionController {
    private static int correctAnswers = 0;

    private static Question currentQuestion;

    private static HashSet<Question> questions = new HashSet<>() {
        {
            add(new Question("Für was steht die Abkürzung ATP?", "Absorptionstemperaturperiode", "Adenosintriphosphat", "Adrenochromtriphosphat", 2));
            add(new Question("Welche Tiere haben zueinander keine Räuber-Beute-Beziehung?", "Fuchs zu Kaninchen", "Nashorn zu Rhinozeros", "Katze zu Maus", 2));
            add(new Question("Welcher dieser Bestandteile ist nicht Teil des Herzens?", "Großherzkammer", "Taschenklappe", "Segelklappe ", 1));
            add(new Question("Welche der folgenden Formen der Polymerbildung gibt es nicht?", "Polymerisation", "Polysubstitution", "Polykondensation", 2));
            add(new Question("Was ist ein Protonendonator?", "Laplace Säure", "Brønsted Säure", "Kraus Säure", 2));
            add(new Question("Welcher dieser Stoffe ist kein Zucker?", "Fructose", "Ribose", "Isodiehose", 3));
            add(new Question("Welcher dieser Reaktionen gibt es nicht?", "Redoxreaktion", "Halbacetal Bildung", "Elektrophilervorderseitenangriff", 3));
            add(new Question("Berechne 230*30", "6900 ", "7020 ", "8030 ",1));
            add(new Question("Welches dieser Metren ist kein Metrum? ", "Daktylus ", "Nimbus ", "Trochäus ",2));
            add(new Question("Wie heißt das erste newtonsche Gesetz? ", "Trägheitssatz ", "Schwerkraftssatz ", "Wechselwirkungssatz ",1));
            add(new Question("Wie viele Bundesstaaten hat die USA? ", "50 ", "51 ", "52 ",1));
            add(new Question("In welcher Klimazone liegt Deutschland? ", "Gemäßigte Zone ", "Subtropische Zone ", "Subpolar Zone ",1));
            add(new Question("Welcher dieser Städte liegt nicht in China? ", "Shanghai ", "Xinchang ", "Singapur ",3));
            add(new Question("Welche Funktion hat das Recht? ", "Profitfunktion ", "Ordnungsfunktion ", "Rettungsfunktion ",2));
            add(new Question("Zu was führt monetärer Ausgleich nicht? ", "Preissenkung ", "Preissteigerung ", "Stagnation ",3));
            add(new Question("Was ist ein Decathlon?", "Dreikampf ", "Zehnkampf ", "Siebenkampf",2));
            add(new Question("Was kann man bei einem Fußballspiel nicht hören? ", "Anpfiff", "Abpfiff ", "Dünnpfiff ",3));
            add(new Question("Welche dieser Sportarten existiert nicht? ", "Schachboxen ", "Fischerstechen ", "Tastschreiben",3));
            add(new Question("Wann endete der zweite Weltkrieg? ", "06. Mai 1949 ", "08. Mai 1945", "02. September 1945 ",3));
            // more questions missing
        }
    };

    public static int getCorrectAnswers() {
        return correctAnswers;
    }

    public static void nextQuestion() {
        if (currentQuestion != null)
        {
            currentQuestion.wurzel.leeren();
            questions.remove(currentQuestion);
        }
        currentQuestion = questions.stream().findAny().get();
        myGame.getInstance().getStatischeWurzel().add(currentQuestion.getRaum());
    }

    public static Question getCurrentQuestion() {
        return currentQuestion;
    }

    public static void answer (int answer) {
        currentQuestion.wurzel.leeren();
        questions.remove(currentQuestion);

        if (answer == currentQuestion.getCorrectAnswer()) {
            correctAnswers++;
        }
    }


}
