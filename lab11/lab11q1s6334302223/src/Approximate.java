
import java.util.ArrayList;


/**
 *
 * @author 6334302223
 */
public class Approximate {
    public static void main(String[] args) {
        
        Expo exp = new Expo(7, 1);
        exp.printValue();
        Sine s = new Sine(7, Math.PI/4);
        s.printValue();
        Cosine cs = new Cosine(7, 1);
        cs.printValue();
        
        Taylor t[] = new Taylor[3];
        t[0] = new Expo(7, 1);
        t[1] = new Sine(7, Math.PI/4);
        t[2] = new Cosine(7, 1);
        
        for(int i = 0; i<t.length;i++){
            t[i].printValue();
        }
        
        
        
    }
    
    
    
}
