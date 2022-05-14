
import java.util.Scanner;

/**
 *
 * @author 6334302223 Kamolrut Sonti
 */
public class Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter course ID, credit and grade; or x to terminate");
        String data = input.nextLine();

        double sumcredit = 0;
        double sumcg = 0;

        if (!data.equals("x")) {
            while (!data.equals("x")) {
                String[] part1 = data.split(" ");
                String id = part1[0];
                String Scredit = part1[1];
                double credit = Double.parseDouble(Scredit);
                String grade = part1[2];

                if (grade.equals("A")) {
                    double A = 4.0;
                    double cg = A * credit;
                    sumcg += cg;
                } else if (grade.equals("B+")) {
                    double Bplus = 3.5;
                    double cg = Bplus * credit;
                    sumcg += cg;
                } else if (grade.equals("B")) {
                    double B = 3;
                    double cg = B * credit;
                    sumcg += cg;
                } else if (grade.equals("C+")) {
                    double Cplus = 2.5;
                    double cg = Cplus * credit;
                    sumcg += cg;
                } else if (grade.equals("C")) {
                    double C = 2;
                    double cg = C * credit;
                    sumcg += cg;
                } else if (grade.equals("D+")) {
                    double Dplus = 1.5;
                    double cg = Dplus * credit;
                    sumcg += cg;
                } else if (grade.equals("D")) {
                    double D = 1.0;
                    double cg = D * credit;
                    sumcg += cg;
                } else {
                    double F = 0.0;
                    double cg = F * credit;
                    sumcg += cg;
                }
                data = input.nextLine();
                sumcredit += credit;

            }
            double GPA = (sumcg) / (sumcredit);
            System.out.println("GPA = " + GPA);
        }

    }

}
