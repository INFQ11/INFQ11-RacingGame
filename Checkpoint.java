import ea.*;
public class Checkpoint extends Rechteck implements Runnable {

    private boolean running = true;

    public int getCode() {
        return code;
    }

    private int code;

    public Checkpoint (int x, int y, int breite, int hoehe, int code) {
        super(x,y,breite, hoehe);
        this.code = code;

    }

    public void run() {
        while (running)
        {
            if (code == 69)
            {
                if (beinhaltet(FahrerFacade.getFahrer1().getCar().mittelPunkt()) && CheckpointController.getCounter() == 4) {
                    CheckpointController.checkpointTriggered(this);
                    running = false;
                }
            }
            else
            if (beinhaltet(FahrerFacade.getFahrer1().getCar().mittelPunkt())) {
                CheckpointController.checkpointTriggered(this);
                running = false;
            }
        }
    }
}
