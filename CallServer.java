
import java.rmi.Naming;

public class CallServer
{
	
  public CallServer()
  {
     try
     {
    	 //java.rmi.server.useCodebaseOnly=false; 
    	 System.out.println("RAServer-1 Started:");
    	 RAServer ra = new RAServer(); 
    	 java.rmi.registry.LocateRegistry.createRegistry(1099);
    	 Naming.rebind("rmi://10.100.55.167:1099/RAServer",ra);
    	 System.out.println("RAServer-1 Registered");
    	 ra.increment();
     }
     catch (Exception e)
     {
       System.out.println("Trouble: " + e);
     }
   }
   public static void main(String args[])
   {
     new CallServer();
   }
}
