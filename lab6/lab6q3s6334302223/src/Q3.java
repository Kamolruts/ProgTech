
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author 6334302223 Kamolrut Sonti
 */
public class Q3 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File scoreFile = new File("/Users/nethkmrs/Desktop/lab6q3s6334302223/src/score.txt");
            Scanner scoreReader = new Scanner(scoreFile);
            
            double sum = 0;
            int count = 0;
            double max = 0;
            double min = 0;
            double score;
            String sc = scoreReader.nextLine();
            if (!scoreReader.equals("x")) {
                score = Double.parseDouble(sc);
                max = score;
                min = score;
                count = count + 1;
                sum = sum + score;
            }
            
            while (scoreReader.hasNextLine()) {
                String Sc = scoreReader.nextLine();
                score = Double.parseDouble(Sc);
                sum += score;
                count++;  
                if (max<score) max = score;
                if (min>score) min = score; 
            }
          
            double avg = sum/count;
            System.out.println("Average score = " + avg);
            System.out.println("Highest score = " + max);
            System.out.println("Lowest score = " + min);
            
            
            scoreReader.close();
        }catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        
        
        
        
        
        
        
    }
    
}
