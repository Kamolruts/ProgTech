
public class FacCourse {

    private int CntFacCourse;
    private final int FacCode;

    public FacCourse(int fc) {
        this.CntFacCourse = 1;
        this.FacCode = fc;
    }

    public void addCntC() {
        this.CntFacCourse++;
    }

    public int getnumfc() {
        return this.CntFacCourse;
    }

    public int getfc() {
        return this.FacCode;
    }

}
