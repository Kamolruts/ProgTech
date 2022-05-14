import java.lang.Math;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author 6334302223 Kamolrut Sonti
 */
public class Student {
    private String name, idforgetdigit;
    private long id;


    public Student(String name, long id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
       return name;
    }
    public long getId() {
        return id;
    }
    public long getFacultyCode() {
        int fc = getDigit(8,9);
        return fc;
    }
    public long getLevelCode() {
        int lc = getDigit(2,2);
        return lc;
    }
    public int getYear() {
        int y = getDigit(0,1);
        return y;
    }
    public int getDigit(int m,int n){
        idforgetdigit = Long.toString(id);
        String a = "";
        for (int i = m; i <= n; i++) {
            a+= idforgetdigit.charAt(i); 
        }
        int A = Integer.parseInt(a);
        return A;
    }     
    public boolean sameYear(Student s) {
       boolean sy = s.getYear() == this.getYear();
        return sy;
    }
    public boolean sameLevel(Student s) {
       boolean sl = s.getLevelCode() == this.getLevelCode();
       return sl; 
    }
    public boolean sameFaculty(Student s) {
       boolean sf = s.getFacultyCode() == this.getFacultyCode();
       return sf;  
    }
    public String toString() {
        String ts = name + " " + id;
        return ts;
    }
    
}    
       