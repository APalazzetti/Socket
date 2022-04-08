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
   


    
    public static void main(String[] args){
        
        try {
         
            
             // creazione socket client            
            Socket client = new Socket(InetAddress.getLocalHost(),2000);
             
             
        BufferedWriter output;
          BufferedReader input;
             
             output= new BufferedWriter(new OutputStreamWriter (client.getOutputStream()));
             
            
            input= new BufferedReader( new InputStreamReader(client.getInputStream()));
            
            String stringaInArr;
            stringaInArr=input.readLine();
                      System.out.println("messaggio in arrivo dal server " +stringaInArr+"\n");
                      // richiesta data e ora
                    String messaggioIn="inviami data e ora";
         output.write(messaggioIn+"\r\n");
              
              output.flush();
            
            stringaInArr=input.readLine();
                      System.out.println("data ottenuta " +stringaInArr+"\n");
              
              
                client.close();
                System.out.println("chiusura connessione \n");
        }
       
        
    
    
           catch (Exception ex) {
          System.out.println("connection error \n");
            }
    }

}
