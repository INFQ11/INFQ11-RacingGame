public class CheckpointController {

    private static int counter = 0;
    public static void checkpointTriggered (Checkpoint cp) {

        int code = cp.getCode();
        System.out.println("CP: " + cp.getCode() + " triggered");
        if (code == 69 && counter == 4) {
            // END CP reached
            counter = 0;
            SteuerungFacade.getStoppuhr().computeResult();
            SteuerungFacade.stopTicker();
            myGame.getInstance().bildschirmWechseln(BildschirmType.ENDE);
        } else {
            counter ++;
            QuestionController.nextQuestion();
        }
    }

    public static int getCounter()
    {
        return counter;
    }
}
