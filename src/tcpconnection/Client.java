/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpconnection;
import java.io.*;
import java.net.*;

/**
 *
 * @author alexp
 */
public class Client {
   
    String messRi;
    public static void main(String[] argv)
	    {
	        try
	        {
	            Socket socket = new Socket("127.0.0.1",2000);
                    BufferedReader  dServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    DataOutputStream VServer = new DataOutputStream(socket.getOutputStream());
                    String messRi = dServer.readLine();
                     System.out.println("Il server comunica: "+messRi);
                     
                    socket.close();
                    
	            
	        }
	        catch(IOException ex)
	        {
	            System.err.println("porta occupata");
	        }
	    }
}
