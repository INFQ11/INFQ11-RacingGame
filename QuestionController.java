import java.util.HashSet;

public class QuestionController {
    private static int correctAnswers = 0;

    private static Question currentQuestion;

    private static HashSet<Question> questions = new HashSet<>() {
        {
            add(new Question("Für was steht die Abkürzung ATP?", "Absorptionstemperaturperiode", "Adenosintriphosphat", "Adrenochromtriphosphat", 2));
            add(new Question("Welche Tiere haben zueinander keine Räuber-Beute-Beziehung?", "Fuchs zu Kaninchen", "Nashorn zu Rhinozeros", "Katze zu Maus", 2));
            add(new Question("Was ist Resorption?", "Die Gewinnung von Energie aus den Nahrungsmitteln die einem Organismus zugeführt werden", "Aufnahme von Stoffen in das Blut oder die Lymphe und die Rückgewinnung eingesetzter Substanzen ", "Die Möglichkeit von Amphibien sich ohne Geschlechtsverkehr fortzupflanzen, durch die Nutzung der Leukozyten", 2));
            add(new Question("Welcher dieser Bestandteile ist nicht Teil des Herzens?", "Großherzkammer", "Taschenklappe", "Segelklappe ", 1));
            add(new Question("Welche der folgenden Formen der Polymerbildung gibt es nicht?", "Polymerisation", "Polysubstitution", "Polykondensation", 2));
            add(new Question("Was ist ein Protonendonator?", "Laplace Säure", "Brønsted Säure", "Kraus Säure", 2));
            add(new Question("Welcher dieser Stoffe ist kein Zucker?", "Fructose", "Ribose", "Isodiehose", 3));
            add(new Question("Welcher dieser Reaktionen gibt es nicht?", "Redoxreaktion", "Halbacetal Bildung", "Elektrophilervorderseitenangriff", 3));

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


}
