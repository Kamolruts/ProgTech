
import java.util.ArrayList;

/**
 *
 * @author 6334302223 Kamolrut Sonti
 */
public class Student {

    private String name, sid;
    private ArrayList<CourseGrade> transcript = new ArrayList<>();

    public Student(String name, String sid) {
        this.name = name;
        this.sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return sid;
    }

    public void addGradeReport(Course course, String grade) {
        var agreport = new CourseGrade(course, grade);
        transcript.add(agreport);
    }

    public double calGPA() {
        
        double sumG = 0.00;
        int sumCD = 0;

        for (int i = 0; i < transcript.size(); i++) {
            var cg = transcript.get(i);
            sumCD += cg.getCourse().getCredit();
            sumG += cg.NumGrade() * (cg.getCourse().getCredit());
        }
        double GPA = sumG / sumCD;
        return GPA;
    }

    public String getReport() {
        String report = "";

        for (int j = 0; j < this.transcript.size(); j++) {
            report += "\n" + this.transcript.get(j).getCourseInfo();
        }
        return report;
    }

    public ArrayList getTranscript() {
        return this.transcript;
    }
}
