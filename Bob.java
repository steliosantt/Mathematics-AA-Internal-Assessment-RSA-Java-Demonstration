
/**
 * Bob receives a message from Alice and decrypts it through his private keys.
 */

public class Bob
{
    private static int p = 5;
    private static int q = 7;
    
    
    
    public static int n = p * q;
    
    
    private static int phin = phi(p,q);
    private static int coefficients[] = new int[2];
    
    public static int e = gete();
    
    
    
    private static int egcd = extendedGCD(e,phin,coefficients);
   
    private static int d = coefficients[0];//(1 + (k*phin))/e;
    
    
    private static int phi(int p,int q){
        return (p-1)*(q-1);
    }
        
    private static int gete(){
        int i = 2;
        while(i<phin){
            if(extendedGCD(i,phin,coefficients)==1) break;
            else i++;
        }
        return i;
    }
    public static int extendedGCD(int a, int b, int[] coefficients) {
        if (b == 0) {
            coefficients[0] = 1; // x
            coefficients[1] = 0; // y
            return a;
        }
        
        int[] nextCoefficients = new int[2];
        int gcd = extendedGCD(b, a % b, nextCoefficients);

        coefficients[0] = nextCoefficients[1];
        coefficients[1] = nextCoefficients[0] - (a / b) * nextCoefficients[1];
        
        return gcd;
    }
    
    public static double send_and_decrypt(double c){
        return decrypt(c);
    }
    
    private static double decrypt(double c){
        double m = (Math.pow(c,d) % n);
        return m;
    }
    
}
