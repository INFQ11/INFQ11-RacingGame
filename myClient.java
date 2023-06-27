

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
         if (!
         inputString.startsWith(myGame.getInstance().getPrefix()))
         { 
            String [] tokens = inputString.trim().split("\\s+");
            
            if (tokens[1].equals(myGame.REQUEST_FAHRER))
            {
                FahrerFacade.setFahrer2(new Fahrer((int)TexturManager.BREITE/2,(int)TexturManager.HOEHE/2, 10, "Fahrer 2", LEHRER.valueOf(tokens[2]), true));
            }
            
            Punkt position = parsePoint(tokens[1], tokens[2]);
            float rotation = parseFloat(tokens[3]);
            
            if (FahrerFacade.getFahrer2() != null)
            FahrerFacade.getFahrer2().moveCar(position, rotation);
         }
         else
         {
             
         }
        }
         
    
    
    public Punkt parsePoint(String xStr, String yStr)
    {
       try
       {
           float x = Float.parseFloat(xStr);
           float y = Float.parseFloat(yStr);
           
           return new Punkt(x,y);
       } catch (NumberFormatException e) {}
       
       throw new UnsupportedOperationException("Wrong number format");
    }
    
    public float parseFloat(String numStr)
    {
        try
       {
           float num = Float.parseFloat(numStr);
           
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
