
/**
 *
 * @author 6334302223 Kamolrut Sonti
 */
public class Course {

    private String name, Cid;
    private int credit;

    public Course(String name, String id) {
        this.name = name;
        this.Cid = Cid;
        this.credit = 3;
    }

    public Course(String name, String Cid, int credit) {
        this.name = name;
        this.Cid = Cid;
        this.credit = credit;
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

    public String toString() {
        String cs = name + " " + Cid + " " + credit;
        return cs;
    }
}
