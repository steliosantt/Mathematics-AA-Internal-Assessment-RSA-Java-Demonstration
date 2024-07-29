
/**
 * Alice encrypts her message and sends it to Bob.
 */

public class Alice
{
    public static int bobs_n = Bob.n;
    public static int bobs_e = Bob.e;
    
    public static double encrypt(double m){
        double c = (Math.pow(m,bobs_e) % bobs_n);
        return c;
    }
    
}
