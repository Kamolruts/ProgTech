
/**
 *
 * @author nethkmrs
 */
public class Course {

    private String name, id, credit;

    public Course(String name, String id) {
        this.name = name;
        this.id = id;
        this.credit = "3";
    }

    public Course(String name, String id, String credit) {
        this.name = name;
        this.id = id;
        this.credit = credit;
    }

    public void setCid(String id) {
        this.id = id;
    }

    public void setCname(String name) {
        this.name = name;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getCname() {
        return name;
    }

    public String getCid() {
        return id;
    }

    public String getCredit() {
        return credit;
    }

    public boolean equals(Course C) {
        boolean N = C.getCname().equals(this.name);
        boolean ID = C.getCid().equals(this.id);
        boolean CD = C.getCredit().equals(this.credit);
        boolean isequals = false;
        if (N && ID && CD) {
            isequals = true;
        }
        return isequals;
    }
    public int compare(Course C){
        int n = C.getCname().compareTo(this.name);
        int Id = C.getCid().compareTo(this.id);
        int cd = C.getCredit().compareTo(this.credit);
        int compareq = 0;
        if (n==0 && Id==0 && cd==0)
        {compareq = 0;}
        else if (n==0 && Id!=0 && cd==0)
        {compareq = 1;}
        else if (n!=0 && Id==0 && cd==0)
        {compareq = 2;}
        else if (n==0 && Id==0 && cd!=0)
        {compareq = 3;}
        else if (n!=0 && Id==0 && cd!=0)
        {compareq = 4;}
        else if (n==0 && Id!=0 && cd!=0)
        {compareq = 5;}
        else if (n!=0 && Id!=0 && cd==0)
        {compareq = 6;}
        else
        {compareq = 7;}
        return compareq; 
    }
    public String toString(){
        String cs = name + " " + id + " " + credit;
        return cs;
    }
}
