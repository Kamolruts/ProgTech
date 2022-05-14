
import java.util.Scanner;


/**
 *
 * @author nethkmrs
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);

        System.out.println("Student 1: Enter ID, name");
        String data1 = input1.nextLine();
        String[] part1 = data1.split(" ");
        String ID1 = part1[0];
        String name1 = part1[1] + " " + part1[2];
        Student s1 = new Student(name1, Long.parseLong(ID1));
        
        Scanner input2 = new Scanner(System.in);
        System.out.println("Student 2: Enter ID, name");
        String data2 = input2.nextLine();
        String[] part2 = data2.split(" ");
        String ID2 = part2[0];
        String name2 = part2[1] + " " + part2[2];
        Student s2 = new Student(name2, Long.parseLong(ID2));
        
        if (s1.sameYear(s2) && s1.sameLevel(s2) && s1.sameFaculty(s2)) {
            System.out.println("Same year, same level, same faculty");
            
        }else if (s1.sameYear(s2) && s1.sameLevel(s2) && !s1.sameFaculty(s2)){
            System.out.println("Same year, same level, different faculty");
            
        }else if(s1.sameYear(s2) && !s1.sameLevel(s2) && s1.sameFaculty(s2)){
            System.out.println("Same year, different level, same faculty");
            
        }else if (!s1.sameYear(s2) && s1.sameLevel(s2) && s1.sameFaculty(s2)) {
            System.out.println("Different year, same level, same faculty");   
            
        }else if (s1.sameYear(s2) && !s1.sameLevel(s2) && !s1.sameFaculty(s2)){
            System.out.println("Same year, different level, different faculty");
            
        }else if (!s1.sameYear(s2) && s1.sameLevel(s2) && !s1.sameFaculty(s2)){
            System.out.println("Different year, same level, different faculty");
            
        }else if(!s1.sameYear(s2) && !s1.sameLevel(s2) && s1.sameFaculty(s2)) {
            System.out.println("Different year, different level, same faculty");
            
        }else{
            System.out.println("Different year, different level, different faculty");
        }   
    }

   
    
}
