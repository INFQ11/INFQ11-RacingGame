import ea.*;

public class myClient extends Client
{
    private String prefix;
    private int freePort = -1;
    private int port;
    
    public myClient (String ip, int port, String prefix)
    {
        super(ip, port);
        this.prefix = prefix;
        this.port = port;
        warteAufVerbindung();
    }
    
    @Override
    public void empfangeInt(int inputInteger)
    {
        this.freePort = inputInteger;
    }
    
    @Override
    public void empfangeByte(byte inputByte)
    {

    }
    
    @Override
    public void empfangeString(String inputString)
    {
         
    }
    
    @Override 
    public void sendeInt(int var)
    {
        
    }
    
    @Override
    public void sendeString(String var)
    {
        
    }
    
    public int getPort()
    {
        return port;
    }
    
    public int getFreePort()
    {
        return freePort;
    }
}
