
import java.util.ArrayList;

/**
 *
 * @author 6334302223 Kamolrut Sonti
 */
public class Course {

    private String name, Cid;
    private int credit;
    static int cnt = 0;
    static ArrayList<FacCourse> faccou = new ArrayList<>();

    public Course(String name, String Cid) {
        this.name = name;
        this.Cid = Cid;
        this.credit = 3;
        this.newFacCourse(Cid);
        cnt += 1;
    }

    public Course(String name, String Cid, int credit) {
        this.name = name;
        this.Cid = Cid;
        this.credit = credit;
        this.newFacCourse(Cid);
        cnt += 1;
    }
    public static int numberofCourses() {
        return cnt;
    }

    public static int numberOfFacCourses(int facultyCode) {
        for (FacCourse faculty : faccou) {
            if (faculty.getfc() == facultyCode) {
                return faculty.getnumfc();
            }
        }
        return -1;
    }

    public void setCid(String id) {
        this.Cid = Cid;
    }

    public void setCname(String name) {
        this.name = name;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getCname() {
        return name;
    }

    public String getCid() {
        return Cid;
    }

    public int getCredit() {
        return credit;
    }

    public boolean equals(Course C) {
        boolean N = C.getCname().equals(this.name);
        boolean ID = C.getCid().equals(this.Cid);
        boolean CD = C.getCredit() == (this.credit);
        boolean isequals = false;
        if (N && ID && CD) {
            isequals = true;
        }
        return isequals;
    }

    public int compare(Course C) {
        int n = C.getCname().compareTo(this.name);
        int Id = C.getCid().compareTo(this.Cid);
        int cd = Integer.toString(C.getCredit()).compareTo(Integer.toString(this.credit));
        int compareq = 0;
        if (n == 0 && Id == 0 && cd == 0) {
            compareq = 0;
        } else if (n == 0 && Id != 0 && cd == 0) {
            compareq = 1;
        } else if (n != 0 && Id == 0 && cd == 0) {
            compareq = 2;
        } else if (n == 0 && Id == 0 && cd != 0) {
            compareq = 3;
        } else if (n != 0 && Id == 0 && cd != 0) {
            compareq = 4;
        } else if (n == 0 && Id != 0 && cd != 0) {
            compareq = 5;
        } else if (n != 0 && Id != 0 && cd == 0) {
            compareq = 6;
        } else {
            compareq = 7;
        }
        return compareq;
    }

    public int getfArray(int Fc) {
        for (int a = 0; a < faccou.size(); a++) {
            if (faccou.get(a).getfc() == Fc) {
                return a;
            }
        }
        return -1;
    }

    public void newFacCourse(String CID) {
        
        int faccode = Integer.parseInt(CID.substring(0, 2));
        int room = this.getfArray(faccode);

        if (room != -1) {
            faccou.get(room).addCntC();
        } else {
            faccou.add(new FacCourse(faccode));
        }
    }

    public static ArrayList<Integer> getallfac() {
        ArrayList<Integer> facultyList = new ArrayList<>();
        faccou.forEach((faculty) -> facultyList.add(faculty.getfc()));
        return facultyList;
    }

    public String toString() {
        String cs = name + " " + Cid + " " + credit;
        return cs;
    }
    
}
