
/**
 *
 * @author 6334302223
 */
public class Cosine extends Taylor {
    
    public Cosine(int k, double x) {
        super(k,x);
    }  
    
    @Override
    public double getApprox() {
        double ans = 0;
        double calc = 0;
        for (int n = 0; n <= this.k; n++) {
            calc = Math.pow(-1, n)*Math.pow(x, (2*n)) / super.factorial((2*n));
            ans = calc + ans;
        }
        return ans;
    }

    @Override
    public void printValue() {
        System.out.println("Value from Math.cos() is " + Math.cos(this.x) +".");
        System.out.println("Approximated value is " + getApprox()+".");
    }
}
