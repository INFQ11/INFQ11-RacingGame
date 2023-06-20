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
         if (inputString.startsWith(myGame.getInstance().getPrefix()))
         {
            String [] tokens = inputString.trim().split("\\s+");
            
            Punkt position = parsePoint(tokens[1], tokens[2]);
            int rotation = parseInteger(tokens[3]);
         }
         else
         {
             
         }
    }
    
    public Punkt parsePoint(String xStr, String yStr)
    {
       try
       {
           int x = Integer.parseInt(xStr);
           int y = Integer.parseInt(yStr);
           
           return new Punkt(x,y);
       } catch (NumberFormatException e) {}
       
       throw new UnsupportedOperationException("Wrong number format");
    }
    
    public int parseInteger(String numStr)
    {
        try
       {
           int num = Integer.parseInt(numStr);
           
           return num;
       } catch (NumberFormatException e) {}
       
       throw new UnsupportedOperationException("Wrong number format");
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
