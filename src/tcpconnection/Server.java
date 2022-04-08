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
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author alexp
 */
public class Server {
    

    public static void main(String[] argv)
	    {
                
	        try {
          
               
          
       ServerSocket serverSocket = new ServerSocket(2000);
       
  System.out.println("server avviato \n");
             
             
       Socket socket=serverSocket.accept();
         
         
         
        
        
         
             BufferedWriter output;
          BufferedReader input;    
             
             output= new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
             
             
            input= new BufferedReader( new InputStreamReader(socket.getInputStream()));
            
            String messaggioIn="Benvenuto";
            
            
            
         output.write(messaggioIn+"\r\n");
             
           output.flush();
            
                
            String stringaInArr;
            stringaInArr=input.readLine();
                      System.out.println("richiesta " +stringaInArr+"\n");
                      
                      
                      
                      SimpleDateFormat data = new SimpleDateFormat("yyyy.MM.dd.HH:mm:ss");
        String dataOra = data.format(new Date());
                   
         output.write(dataOra+"\r\n");
              
            output.flush();
              
        
         socket.close();
           System.out.println("connection close \n");
            serverSocket.close();
    }
        catch (IOException ex) {
            System.out.println("Errore IO");
        }
        
    }
    
}


     

   
   

    
    

