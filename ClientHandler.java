import ea.*;

public class ClientHandler implements Empfaenger
{
    private NetzwerkVerbindung connection;
    
    public ClientHandler(NetzwerkVerbindung connection)
    {
        this.connection = connection;
        
        connection.empfaengerHinzufuegen(this);
    }
    
    public NetzwerkVerbindung getConnection()
    {
        return connection;
    }
    
    @Override 
    public void verbindungBeendet()
    {
        
    }
    
    public void empfangeBoolean(boolean var)
    {
        
    }
    
    public void empfangeChar(char var)
    {
        
    }
    
    public void empfangeByte(byte var)
    {
        
    }
    
    public void empfangeDouble(double var)
    {
        
    }
    
    public void empfangeString(String var)
    {
        
    }
    
    public void empfangeInt(int var)
    {
        
    }
}
