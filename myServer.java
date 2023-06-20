import ea.*;
import java.util.ArrayList;

public class myServer
{
    
    public static void main (String [] args)
    {
        myServer server = new myServer();
        myClient client = new myClient("192.168.220.170");
        
        server.addHandler1();
    }
    
    private Server server;
    
    private ClientHandler handler1, handler2;

    public myServer()
    {
        server = new Server(7654);
    }
    
    public void addHandler1()
    {
        handler1 = new ClientHandler(server.naechsteVerbindungAusgeben());
    }
    
    public void addHandler2()
    {
        handler2 = new ClientHandler(server.naechsteVerbindungAusgeben());
    }
}
