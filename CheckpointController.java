public class CheckpointController {

    private static int counter = 0;
    public static void checkpointTriggered (Checkpoint cp) {

        int code = cp.getCode();
        if (code == 69 && counter == 4) {
            // END CP reached
            counter = 0;
            SteuerungFacade.getStoppuhr().computeResult();
            SteuerungFacade.stopTicker();
            myGame.getInstance().bildschirmWechseln(BildschirmType.ENDE);
        } else {
            if (cp.getCode() == 1)
            {
                QuestionController.nextQuestion();
            }
            counter ++;
        }
    }

    public static int getCounter()
    {
        return counter;
    }
}
