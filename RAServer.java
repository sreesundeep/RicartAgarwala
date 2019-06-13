
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.Scanner;

public class RAServer extends java.rmi.server.UnicastRemoteObject implements iface
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	long time = 0;

	public RAServer() throws Exception
	{
		super();							
	}

	public long print(){
		return time;
	}

	public void increment() throws InterruptedException {
		// TODO Auto-generated method stub
		
		while(true){
			time++;
			//System.out.println(""+time);
			Thread.sleep(1000);
		}
	}
	
	
}
