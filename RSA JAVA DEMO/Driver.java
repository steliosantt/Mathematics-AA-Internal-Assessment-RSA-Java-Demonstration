
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Driver
{
    public static void main(String[] args){
        System.out.println("Enter number for Alice to send to Bob: ");
        Scanner in = new Scanner(System.in);
        double message = in.nextDouble();
        double c = Alice.encrypt(message);
        System.out.println("After encryption the message is: "+c);
        double nm = Bob.send_and_decrypt(c);
        System.out.println("After decryption from Bob the message is: "+nm);
    }
}
