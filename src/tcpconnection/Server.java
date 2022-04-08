/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpconnection;
import java.net.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
/**
 *
 * @author alexp
 */
public class Server {
    

    public static void main(String[] argv)
	    {
                
	        try
	        {
                    
	            ServerSocket serverSocket=new ServerSocket(2000);
                    System.out.println("server avviato correttamente");
                    Socket socket=serverSocket.accept();
                   BufferedReader dClient =  new BufferedReader(new InputStreamReader(socket.getInputStream()));
                   DataOutputStream vClient = new DataOutputStream(socket.getOutputStream());
                   String messInv = "Ben arrivato!";
                   
                    socket.close();
	            
	        }
	        catch(IOException ex)
	        {
	            System.err.println("porta occupata");
	        }
	    }
    private BufferedReader dalClient;


     
}
   
   

    
    

