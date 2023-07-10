public class CheckpointController {

    private static int counter = 0;
    public static void checkpointTriggered (Checkpoint cp) {

        int code = cp.getCode();

        if (code == 69) {
            // END CP reached
            counter = 0;
            SteuerungFacade.getStoppuhr().stop();
            SteuerungFacade.getStoppuhr().getResult();
            // myGame.getInstance().bildschirmWechseln(BildschirmType.ENDBILDSCHIRM);
        } else {
            counter ++;

        }
        System.out.println("CP: " + cp.getCode() + " triggered");
        counter++;
    }
}
