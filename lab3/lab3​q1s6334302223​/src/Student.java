
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author 6334302223 Kamolrut Sonti
 */
public class Student {
    private String name;
    private int id, bday, bmonth, byear, cyear;
  
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        GregorianCalendar gcal = new GregorianCalendar();
        this.bday = gcal.get(Calendar.DATE);
        this.bmonth = gcal.get(Calendar.MONTH);
        this.byear = gcal.get(Calendar.YEAR);
    }
    public Student(String name, int id, int bday, int bmonth, int byear) {
        this.name = name;
        this.id = id;
        this.bday = bday;
        this.bmonth = bmonth;
        this.byear = byear;
    }
    public void setBD(int bday, int bmonth, int byear) {
        this.bday = bday;
        this.bmonth = bmonth;
        this.byear = byear;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBD() {
    String BD = bday + " " + bmonth + " " + byear;
        return BD;
    }
    public String getName() {
       return name;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        GregorianCalendar gcal = new GregorianCalendar();
        cyear = gcal.get(Calendar.YEAR);
        int age = cyear - byear;
        return age;
    }
    public int daysToYears(int day) {
        int year = (int)Math.ceil(day/365);
        return year;
    }
    public boolean equals(Student s) {
       boolean n = s.getName().equals(this.name);
       boolean i = s.getId()==this.id;
       boolean d = s.getBD().equals(this.getBD());
       boolean isequals = false;
       if (n && i && d)
           isequals = true;
       return isequals;
    }
    public String toString() {
        String ts = name + " " + id + " " + bday + " " + bmonth + " " + byear;
        return ts;
    }
}
   
    

