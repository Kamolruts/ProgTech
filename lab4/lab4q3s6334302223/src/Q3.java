import java.util.Scanner;
/**
 *
 * @author 6334302223 Kamolrut Sonti
 */
public class Q3 {
    public static void main(String[] args) {
        
        Scanner input1 = new Scanner(System.in);
        System.out.print("Point A: ");
        String data1 = input1.nextLine();
        String[] part1 = data1.split(" ");
        String xA = part1[0];
        String yA = part1[1];
        Double DxA = Double.parseDouble(xA);
        Double DyA = Double.parseDouble(yA);
        
        Point pA = new Point(DxA,DyA);
        
        Scanner input2 = new Scanner(System.in);
        System.out.print("Point B: ");
        String data2 = input2.nextLine();
        String[] part2 = data2.split(" ");
        String xB = part2[0];
        String yB = part2[1];
        Double DxB = Double.parseDouble(xB);
        Double DyB = Double.parseDouble(yB);
        Point pB = new Point(DxB,DyB);
        System.out.println("A = " + pA + " " + "B = " + pB + " " + "Distance = " + pA.distance(DxB, DyB));
        
        Scanner input3 = new Scanner(System.in);
        System.out.print("Move the points: ");
        String data3 = input3.nextLine();
        String[] part3 = data3.split(" ");
        String mX = part3[0];
        String mY = part3[1];
        Double DmX = Double.parseDouble(mX);
        Double DmY = Double.parseDouble(mY);
        pA.translate(DmX, DmY);
        pB.translate(DmX, DmY);
        Double xBchange = DxB +DmX;
        Double yBchange = DyB +DmY;
        
        System.out.println("A = " + pA + " " + "B = " + pB + " Distance = " + pA.distance(xBchange,yBchange));
                
        if (DxA.equals(DxB) && DyA.equals(DyB)) {
            System.out.println("A and B are at the same position.");
        } else {
            System.out.println("A and B are not at the same position.");
        }
                
        
    }
    
}
