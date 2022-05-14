
/**
 *
 * @author 6334302223
 */
public abstract class Taylor {

    int k;
    double x;

    public Taylor(int k, double x) {
        this.k = k;
        this.x = x;
    }

    public int factorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }

    public int getIteration() {
        return this.k;
    }

    public double getValue() {
        return this.x;
    }

    public abstract void printValue();
    public abstract double getApprox();
}
