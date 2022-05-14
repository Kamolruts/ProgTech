
import java.util.Scanner;

/**
 *
 * @author 6334302223 Kamolrut Sonti
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c : ");
        String data = input.nextLine();
        String[] part = data.split(" ");
        String Sa = part[0];
        String Sb = part[1];
        String Sc = part[2];
        int a = Integer.parseInt(Sa);
        int b = Integer.parseInt(Sb);
        int c = Integer.parseInt(Sc);
        
        int sum = 0;
        for (int i=a; i<=b; i++){
            for (int j=i; j<=(c*i); j++){
                sum +=((i*i)+j);
            }
        }
        System.out.println("Answer = " + sum);
        
        
        
        
    }
    
}



            
            