
/**
 *
 * @author 6334302223
 */
public class FindRecursive {
    public static void main(String[] args) {
        Sentence s = new Sentence("Prog Tech"); 
        boolean b = s.find("Te"); 
        if (b)
            System.out.println("Found");
        else
            System.out.println("Not found");
        
    }
    
}

//If you want to check something not found
//Please refresh your netbeans when you want it to show "not found"