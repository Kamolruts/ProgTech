
import java.util.Arrays;

/**
 *
 * @author 6334302223 Kamolrut Sonti
 */
public class CourseGrade {

    private String ChaGrade;
    private Course course;

    public CourseGrade(Course course, String grade) {
        this.course = course;
        this.ChaGrade = grade;
    }
    public Course getCourse() {
        return this.course;
    }
    public double NumGrade() {

        switch (this.ChaGrade) {
            case "A":
                return (double) 4.00;
            case "B+":
                return (double) 3.50;
            case "B":
                return (double) 3.00;
            case "C+":
                return (double) 2.50;
            case "C":
                return (double) 2.00;
            case "D+":
                return (double) 1.50;
            case "D":
                return (double) 1.00;
            case "F":
                return (double) 0.00;
            default:
                return (double) 0.00;
        }
    }
     public String getCourseInfo() {
        return this.course.getCid() + " " + this.course.getCname() + " " + this.course.getCredit() + " " + this.ChaGrade;
    }

}