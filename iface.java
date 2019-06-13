
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;


public interface iface extends java.rmi.Remote
{

	public long print() throws java.rmi.RemoteException, MalformedURLException, NotBoundException, IOException;
    
}