
/**
 * Write a description of class Alice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Alice
{
    public static int bobs_n = Bob.n;
    public static int bobs_e = Bob.e;
    
    public static double encrypt(double m){
        double c = (Math.pow(m,bobs_e) % bobs_n);
        //double c = (Math.pow(m,bobs_e) );
        return c;
    }
    
}
