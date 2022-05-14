
import java.util.Random;

/**
 *
 * @author 6334302223 Kamolrut Sonti
 */
public class Q2 {

    public static int[][] random(int row, int column) {
        Random num = new Random();
        int[][] number = new int[row][column];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                number[i][j] = num.nextInt(-99, 100);
            }
        }
        return number;
    }

    public static void main(String[] args) {
        Mtx A, B, C;
        A = new Mtx(random(10, 5));
        B = new Mtx(random(10, 5));
        C = new Mtx(random(5, 3));

        System.out.println("");
        System.out.println("A = ");
        Mtx.ShowMatrix(A.getMatrix());

        System.out.println("");
        System.out.println("B = ");
        Mtx.ShowMatrix(B.getMatrix());

        System.out.println("");
        System.out.println("C = ");
        Mtx.ShowMatrix(C.getMatrix());

        if (A.equalSize(B)) {
            int[][] sum = A.add(B);
            System.out.println("");
            System.out.println("A+B = ");
            Mtx.ShowMatrix(sum);
        } else {
            System.out.println("");
            System.out.println("Illegal matrix dimensions.");
        }
        
        System.out.println("");
        System.out.println("2*B = ");
        int[][] multiScalar = B.mulS(2);
        Mtx.ShowMatrix(multiScalar);

        if (A.compatible(B)) {
            System.out.println("");
            System.out.println("A*B = ");
            int[][] multimatrix = A.mulM(B);
            Mtx.ShowMatrix(multimatrix);
        } else {
            System.out.println("");
            System.out.println("A and B are not compatible");
        }
        if (A.compatible(C)) {
            System.out.println("");
            System.out.println("A*C = ");
            int[][] multimatrix = A.mulM(C);
            Mtx.ShowMatrix(multimatrix);
        } else {
            System.out.println("");
            System.out.println("A and C are not compatible");
        }

    }
}