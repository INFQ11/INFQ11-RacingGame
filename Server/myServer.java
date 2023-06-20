package Server;


import ea.*;
import java.util.ArrayList;

public class myServer implements Empfaenger
{
    private Server server;
    
    public myServer(int port)
    {
        server = new Server(port);
        
        server.globalenEmpfaengerSetzen(this);
    }
    
    public Server getServer()
    {
        return this.server;
    }

    // Empfangen-Methoden
    
    @Override 
    public void verbindungBeendet()
    {
        
    }
    
    public void empfangeString(String inputString)
    {
        /*
        if (inputString.equals(myGame.REQUEST_FREE_PORT))
        {
            server.sendeInt(ServerController.getInstance().getFreePort());
        }
        else
        {
        server.sendeString(inputString);
        }   
        */
    }
    
    
    public void empfangeInt(int var){}
    
    public void empfangeBoolean(boolean var){}
    
    public void empfangeChar(char var){}
    
    public void empfangeByte(byte var){}
    
    public void empfangeDouble(double var){}
}
