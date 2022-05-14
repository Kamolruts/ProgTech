
/**
 *
 * @author 6334302223
 */
public class Sine extends Taylor {
    
    public Sine(int k, double x) {
        super(k,x);
    }  
    
    @Override
    public double getApprox() {
        double ans = 0;
        double calc = 0;
        for (int n = 0; n <= this.k; n++) {
            calc = Math.pow(-1, n)*Math.pow(x, (2*n)+1) / super.factorial((2*n)+1);
            ans = calc + ans;
        }
        return ans;
    }

    @Override
    public void printValue() {
        System.out.println("Value from Math.sine() is " + Math.sin(this.x)+".");
        System.out.println("Approximated value is " + getApprox()+".");
    }
    
    
}
