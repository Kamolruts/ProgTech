import java.lang.Double;
/**
 *
 * @author 6334302223 Kamolrut Sonti
 */
public class Point {
    private double x1,y1,x2,y2;
    private double x,y;

    public Point(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
    }
    public double distance(double x2, double y2) {
        double dt = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        return dt;
    }
    public void translate(double x, double y) {
        x1 = x1 + x;
        y1 = y1 + y;
        x2 = x2 + x;
        y2 = y2 + y;  
    }
    public double getx() {
       return x1;
    }
    public double gety() {
       return y1;
    }
    public boolean equals(Point p) {
        boolean isequals = false;
        if (Double.compare(x1, x2)==0 && Double.compare(y1, y2)==0) 
            isequals = true;    
        return isequals;
    }
    public String toString() {
        String position = "(" + x1 + "," + y1 + ")";
        return position;
    }
}


