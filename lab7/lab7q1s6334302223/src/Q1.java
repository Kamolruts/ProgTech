
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 6334302223 Kamolrut Sonti
 */
public class Q1 {

    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int num = Integer.parseInt(input.nextLine());
        int x = 2;
        int y = 0;
        int[] array = new int[num];
        while (y < num) {
            if (isPrime(x)) {
                array[y] = x;
                y++;
            }
            x++;
        }
        for (int a = 0; a < array.length; a++) {
            
            System.out.println(array[a]);
        }
    }
}
