package Server;


import ea.*;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;

public class ServerController
{
    private HashSet<Integer> freePorts;
    private HashMap<Integer, myServer> serverMap;
    private myServer standardServer;
    public static final int STANDARD_PORT = 7001;
    
    private static ServerController instance;
    
    public static void main (String [] args)
    {
        getInstance();
        Scanner sc = new Scanner(System.in);
        String input = "";
        
        do {
            input = sc.next();
        } while (!input.equals("END"));
        
        getInstance().standardServer.getServer().beendeVerbindung();
    }
    
    private ServerController()
    {
        standardServer = new myServer(STANDARD_PORT);
        
        freePorts = new HashSet<>();
        
        for (int i = 7002; i <= 7010; i++)
        {
           freePorts.add(i); 
        }
        
        
        serverMap = new HashMap<>();
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
        System.out.println("Recieved port " + freePort);
        return freePort;
    }
}
