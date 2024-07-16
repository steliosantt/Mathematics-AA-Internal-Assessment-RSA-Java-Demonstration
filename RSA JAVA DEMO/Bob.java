
/**
 * Bob wishes to receive a message from Alice.
 */

import java.util.*;

public class Bob
{
    //private static int p = Prime_Number_Generator.getPrime();
    private static int p = 3;

    //private static int q = Prime_Number_Generator.getPrime();
    private static int q = 7;

    public static int n = p * q;
    private static int phin = phi(p,q);
    public static int e = gete();
    //private static int k = Prime_Number_Generator.getNum();
    private static int k = 2;

    private static int d = (1 + (k*phin))/e;
    
    private static int egcd(int a, int b) {
        if (a == 0) return b;
        
        while (b != 0){
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        
        return a;
    }
    
    private static int phi(int p,int q){
        return (p-1)*(q-1);
    }
        
    private static int gete(){
        int i = 2;
        while(i<phin){
            if(egcd(i,phin)==1) break;
            else i++;
        }
        return i;
    }
    
    public static double send_and_decrypt(double c){
        return decrypt(c);
    }
    
    private static double decrypt(double c){
        double m = (Math.pow(c,d) % n);
        return m;
    }
    
}
