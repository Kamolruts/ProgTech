
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 6334302223 Kamolrut Sonti
 */
public class Q1 {

    public static void main(String[] args) {
        
        ArrayList<Course> course = new ArrayList<Course>();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter course ID, name, credit: or X to stop");
        String Data = input.nextLine();
        
        while (!Data.equals("X")) {
            String[] parts = Data.split(" ");
            String cID = parts[0];
            String cName = parts[1] + " " + parts[2];
            int credit = Integer.parseInt(parts[3]);
            
            course.add(new Course(cName,cID,credit));
            
            //System.out.println(cID+" "+cName+" "+credit);
            
            Data = input.nextLine();
        }
        
        System.out.println(Course.numberofCourses() + " " + "courses");
        
        for(int faculty : Course.getallfac()) {
            System.out.println(Course.numberOfFacCourses(faculty) + " courses for " + faculty);
        }
    }
}
