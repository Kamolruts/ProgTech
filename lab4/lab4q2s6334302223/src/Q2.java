import java.util.Scanner;
/**
 *
 * @author 6334302223 Kamolrut Sonti
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter firstname lastname age: ");
        String data1 = input.nextLine();
        String[] part1 = data1.split(" ");
        String firstname = part1[0];
        String lastname = part1[1];
        String Sage = part1[2];
        int age = Integer.parseInt(Sage);
        
        System.out.println(lastname + ", " + firstname + " is " + age + " years old.");
        
    }
    
}
