
/**
 * Main Class.
 * Stylianos N Antoniadis, 2024
 */
import java.util.*;

public class Main
{
    public static void main(String[] args){
        
        while(true){
            System.out.println("\nEnter number for Alice to send to Bob (enter -1 to exit): ");
            Scanner in = new Scanner(System.in);
            double message = in.nextDouble();
            if(message == -1) break;
            double c = Alice.encrypt(message);
            System.out.println("After encryption the message that Alice sends to Bob is: "+c);
            double nm = Bob.send_and_decrypt(c);
            System.out.println("After decryption from Bob the message is: "+(int)nm);            
        }
    }
}
