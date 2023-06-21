package Server;


import ea.*;
import java.util.ArrayList;

public class myServer implements Empfaenger
{
    private Server server;
    public static final String REQUEST_FREE_PORT = "RFP";
    public static final String REQUEST_FAHRER = "RF";
    public static final String SEND_FAHRER = "SF";
    private String lehrerA;
    private String lehrerB;
    
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
        System.out.println("Server recieved String: " + inputString);
        
        if (inputString.equals(myServer.REQUEST_FREE_PORT))
        {
            server.sendeInt(ServerController.getInstance().getFreePort());
        }
        else
        {
            
        String [] tokens = inputString.trim().split("\\s+");
        
        if (tokens[1].equals(myServer.SEND_FAHRER))
        {
            if (tokens[0].equals("A"))
            {
                lehrerA = tokens[1];
            }
            else lehrerB = tokens[1];
        }
        else
        {
            if (tokens[1].equals(myServer.REQUEST_FAHRER))
            {
                if (tokens[0].equals("A"))
                {
                     server.sendeString("B " + myServer.REQUEST_FAHRER + " " + lehrerB);
                }
                else server.sendeString("A " + myServer.REQUEST_FAHRER + " " + lehrerA);
            }
            else
            {
        server.sendeString(inputString);
        }
        }
        }   
    }
    
    
    public void empfangeInt(int var){}
    
    public void empfangeBoolean(boolean var){}
    
    public void empfangeChar(char var){}
    
    public void empfangeByte(byte var){}
    
    public void empfangeDouble(double var){}
}
