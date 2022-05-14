
/**
 *
 * @author 6334302223
 */
public class Expo extends Taylor {

    public Expo(int k, double x) {
        super(k, x);
    }

    @Override
    public double getApprox() {
        double ans = 0;
        double calc = 0;
        for (int n = 0; n <= this.k; n++) {
            calc = Math.pow(x, n) / super.factorial(n);
            ans = calc + ans;
        }
        return ans;
    }
    @Override
    public void printValue() {
        System.out.println("Value from Math.exp() is " + Math.exp(this.x)+".");
        System.out.println("Approximated value is " + getApprox()+".");
    }
}
