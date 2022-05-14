
import java.util.Scanner;

/**
 *
 * @author 6334302223 Kamolrut Sonti
 */
public class Q3 {

    public static void main(String[] args) {

        Student[] Studentarray = new Student[3];
        Course[] Coursearray = new Course[5];
        
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter 3 student ID and name: ");

        for (int i = 0; i < Studentarray.length; i++) {
            String data1 = input1.nextLine();
            String[] StudentInfoArray = data1.split(" ");
            String sID = StudentInfoArray[0];
            String sName = StudentInfoArray[1] + " " + StudentInfoArray[2];
            Studentarray[i] = new Student(sName, sID);
        }
        
        System.out.println("Enter 5 course ID, name and credit: ");
        
        for (int j = 0; j < Coursearray.length; j++) {
            String data2 = input1.nextLine();
            String[] CourseInfoArray = data2.split(" ");
            String cID = CourseInfoArray[0];

            if (CourseInfoArray.length == 4) {
                
                String cName = CourseInfoArray[1] + " " + CourseInfoArray[2];
                int Credit = Integer.parseInt(CourseInfoArray[3]);
                Coursearray[j] = new Course(cName, cID, Credit);
                
            } else {
                
                String Subject_name = CourseInfoArray[1] + " " + CourseInfoArray[2] + " " + CourseInfoArray[3];
                int Credit = Integer.parseInt(CourseInfoArray[4]);
                Coursearray[j] = new Course(Subject_name, cID, Credit);
            }
        }

        for (int k = 0; k < Studentarray.length; k++) {           
            System.out.println(Studentarray[k].getName() + " grade report: ");
            String grade_report = input1.nextLine();
            
            while (!grade_report.equals("X")) {
                String[] cInfo = grade_report.split(" ");
                
                for (int course = 0; course < Coursearray.length; course++) {
                    if (cInfo[0].equals(Coursearray[course].getCid())) {
                        Studentarray[k].addGradeReport(Coursearray[course], cInfo[1]);
                    }                  
                }
                  grade_report = input1.nextLine();

            }

        }

        for (int l = 0; l < Studentarray.length; l++) {
            System.out.println("------Transcript ------");
            System.out.print(" " + Studentarray[l].getId() + " " + Studentarray[l].getName());
            System.out.println(Studentarray[l].getReport());
            System.out.println(" GPA: " + Studentarray[l].calGPA());

        }
    }
}