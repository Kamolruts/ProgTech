
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 6334302223 Kamolrut Sonti
 */
public class Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = Integer.parseInt(input.nextLine());
        
        ArrayList<Integer> arraylist = new ArrayList<>();
        
        int check;
        
        for (int x = 2; x <= n; x++) {
            check = 1;
            for (int y = 2; y < x; y++) {
                if (x % y == 0) {
                    check = 0;
                }
            }

            if (check == 1) {
                arraylist.add(x);
            }

        }
        for (int a = 0; a < arraylist.size(); a++) {
            int alist = arraylist.get(a);
            System.out.println(alist);

        }

    }

}
