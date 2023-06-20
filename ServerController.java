import ea.*;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;

public class ServerController
{
    private HashSet<Integer> freePorts;
    private HashMap<Integer, myServer> serverMap;
    private myServer standardServer;
    public static final int STANDARD_PORT = 7000;
    
    private static ServerController instance;
    
    public static void main (String [] args)
    {
        getInstance();
        Scanner sc = new Scanner(System.in);
        String input = "";
        
        do {
            input = sc.next();
        }while (!input.equals("END"));
        
    }
    
    private ServerController()
    {
        standardServer = new myServer(STANDARD_PORT);
        
        freePorts = new HashSet<>(){
        {
        for (int i = 7001; i <= 7010; i++)
        {
           add(i); 
        }
        }
        };
    }
    
    public static ServerController getInstance()
    {
        if (instance != null)
        {
            return instance;
        }
        else return instance = new ServerController();
    }
    
    public int getFreePort()
    {
        int freePort = freePorts.stream().findAny().orElse(-1);
        if (freePort == -1)
            return -1;
            
        serverMap.put(freePort, new myServer(freePort));
        freePorts.remove(freePort);
        return freePort;
    }
}
