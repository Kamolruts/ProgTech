
import java.util.Scanner;

/**
 *
 * @author nethkmrs
 */
public class Q2 {

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter course ID, course name, credit: ");
        String data1 = input1.nextLine();
        String[] part1 = data1.split(" ");
        String cid1 = part1[0];
        String cname1 = part1[1] + " " + part1[2];
        String cdt1 = part1[3];
        Course s1 = new Course(cname1, cid1, cdt1);

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter course ID, course name: ");
        String data2 = input2.nextLine();
        String[] part2 = data2.split(" ");
        String cid2 = part2[0];
        String cname2 = part2[1] + " " + part2[2];
        Course s2 = new Course(cname2, cid2);

        if (s1.equals(s2)) {
            System.out.println("Same course");
            
            Scanner input3 = new Scanner(System.in);
            System.out.print("Enter course ID, course name, credit: ");
            String data3 = input3.nextLine();
            String[] part3 = data3.split(" ");
            String cid3 = part3[0];
            String cname3 = part3[1] + " " + part3[2];
            String cdt3 = part3[3];
            s2.setCname(cname3);
            s2.setCid(cid3);
            s2.setCredit(cdt3);        
            input3.close();
            
        } else if (s1.getCname().equals(s2.getCname()) && !s1.getCid().equals(s2.getCid()) && s1.getCredit().equals(s2.getCredit())) {
            System.out.println("Different course ID.");
        } else if (!s1.getCname().equals(s2.getCname()) && s1.getCid().equals(s2.getCid()) && s1.getCredit().equals(s2.getCredit())) {
            System.out.println("Different course name.");
        } else if (s1.getCname().equals(s2.getCname()) && s1.getCid().equals(s2.getCid()) && !s1.getCredit().equals(s2.getCredit())) {
            System.out.println("Different credit.");
        } else if (!s1.getCname().equals(s2.getCname()) && s1.getCid().equals(s2.getCid()) && !s1.getCredit().equals(s2.getCredit())) {
            System.out.println("Different course name and credit.");
        } else if (s1.getCname().equals(s2.getCname()) && !s1.getCid().equals(s2.getCid()) && !s1.getCredit().equals(s2.getCredit())) {
            System.out.println("Different course ID and credit.");
        } else if (!s1.getCname().equals(s2.getCname()) && !s1.getCid().equals(s2.getCid()) && s1.getCredit().equals(s2.getCredit())) {
            System.out.println("Different course name and course ID.");
        } else {
            System.out.println("Different course name, course ID and credit.");
        }
        System.out.println(s1.getCid() + " " + s1.getCname() + " " + s1.getCredit());
        System.out.println(s2.getCid() + " " + s2.getCname() + " " + s2.getCredit());
        
        int icdt1 = Integer.parseInt(cdt1);
        int icdt2 = Integer.parseInt(s2.getCredit());
        int totalCredit = icdt1 + icdt2;
        System.out.println("Total credit: " + totalCredit);
        
        input1.close();
        input2.close();
        
    }

}


