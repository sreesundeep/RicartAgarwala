



import java.rmi.Naming;
import java.util.Date;

class Client1{  
	
	public void sendrequest() throws InterruptedException
	{
        try{	
        iface c=(iface)Naming.lookup("rmi://localhost:1099/RAServer");
        System.out.println("From A...");
        long lDateTime = new Date().getTime();
        System.out.println("Date() - Time in milliseconds: " + lDateTime);
       long i= c.print();
       long lDateTime1 = new Date().getTime();
       System.out.println("Date() - Time in milliseconds: " + lDateTime);
       long diff=(lDateTime1-lDateTime)/2;
       i= (i+diff);
       System.out.println("dif: "+diff);
       System.out.println("value: "+i);
       while(true){
    	   
    	   System.out.println("time in Client A: "+i );
    	   Thread.sleep(1000);
    	   i=i+1;
       }
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    }
    
    public static void main(String args[]) throws InterruptedException {
    	Client1 obj = new Client1();    	
    	obj.sendrequest();
    }
}

