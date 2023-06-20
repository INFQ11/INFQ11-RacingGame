import ea.*;

public class myClient extends Client
{
    public myClient (String ip)
    {
        super(ip, 7654);
        
        warteAufVerbindung();
    }
    
    @Override
    public void empfangeInt(int inputInteger)
    {
        
    }
    
    @Override
    public void empfangeByte(byte inputByte)
    {
        System.out.println(inputByte);
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
}
